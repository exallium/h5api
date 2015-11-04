package com.exallium.h5.app

import retrofit.Callback

import android.app.Activity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.exallium.h5.api.ApiFactory
import com.exallium.h5.api.models.metadata.Medal
import retrofit.Response
import retrofit.Retrofit

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.recycler_view)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)

        val factory = ApiFactory(resources.getString(R.string.api_key))
        factory.metadata.medals.enqueue(object : Callback<List<Medal>> {
            override fun onFailure(t: Throwable?) {
                throw UnsupportedOperationException()
            }

            override fun onResponse(response: Response<List<Medal>>, retrofit: Retrofit) {
                recyclerView.adapter = MedalAdapter(response.body())
            }
        })
    }

}
