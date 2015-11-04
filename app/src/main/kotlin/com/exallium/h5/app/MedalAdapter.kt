package com.exallium.h5.app

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.exallium.h5.api.models.metadata.Medal

class MedalAdapter(val items: List<Medal>) : RecyclerView.Adapter<MedalAdapter.ViewHolder>() {

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.view?.text = items[position].name
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder? {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.support_simple_spinner_dropdown_item, parent, false) as TextView)
    }

    class ViewHolder(val view: TextView) : RecyclerView.ViewHolder(view) {
    }

}