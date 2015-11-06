/*
 * Copyright (c) 2015 Alex Hart
 *
 *
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 *
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 *
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.  IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.exallium.h5.app

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.support.v4.util.LruCache
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.exallium.h5.api.models.metadata.Medal
import com.squareup.picasso.Picasso
import com.squareup.picasso.Transformation

class MedalAdapter(val items: List<Medal>) : RecyclerView.Adapter<MedalAdapter.ViewHolder>() {

    val medalCache: LruCache<String, Bitmap> = LruCache(items.size)

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.bind(items[position]);
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder? {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item_2line_icon, parent, false), medalCache)
    }

    class ViewHolder(view: View, val cache: LruCache<String, Bitmap>) : RecyclerView.ViewHolder(view), com.squareup.picasso.Target {

        override fun onPrepareLoad(placeHolderDrawable: Drawable?) {

        }

        override fun onBitmapFailed(errorDrawable: Drawable?) {

        }

        override fun onBitmapLoaded(bitmap: Bitmap?, from: Picasso.LoadedFrom?) {
            val medal = icon.tag as Medal
            val cachedMedal = cache.get(medal.name)
            if (cachedMedal == null) {
                val medalImage = SpriteSheetTransformation(medal).transform(bitmap)
                cache.put(medal.name, medalImage)
                icon.setImageBitmap(medalImage)
            } else {
                icon.setImageBitmap(cachedMedal)
            }
        }

        val icon: ImageView
        val title: TextView
        val subtitle: TextView

        init {
            title = itemView.findViewById(R.id.title) as TextView
            icon = itemView.findViewById(R.id.icon) as ImageView
            subtitle = itemView.findViewById(R.id.subtitle) as TextView
        }

        internal fun bind(medal: Medal) {
            title.text = medal.name
            subtitle.text = medal.description
            icon.tag = medal
            Picasso.with(icon.context)
                    .load(medal.spriteLocation.spriteSheetUri)
                    .into(this)
        }

    }

    class SpriteSheetTransformation(medal: Medal) : Transformation {

        private val x: Int
        private val y: Int
        private val w: Int
        private val h: Int
        private val medalName: String

        init {
            x = medal.spriteLocation.left
            y = medal.spriteLocation.top
            w = medal.spriteLocation.width
            h = medal.spriteLocation.height
            medalName = medal.name
        }

        override fun key(): String? = "tf:medal:%s:%d:%d:%d:%d".format(medalName, x, y, w, h)

        override fun transform(source: Bitmap?): Bitmap? {
            Log.d("TR", key())
            val b = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888)
            val c = Canvas(b)
            val src = Rect(x, y, x + w, y + h)
            val dst = Rect(0, 0, w, h)
            c.drawBitmap(source, src, dst, null)
            return b
        }

    }

}