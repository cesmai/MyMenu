package com.example.hb.mymenu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler.*

class RecyclerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        // Initialize data for RecyclerView
        val androidVersionArray = arrayOf(
            AndroidVersion("Banana", R.drawable.ic_recycler_banana),
            AndroidVersion("Lollipop", R.drawable.ic_recycler_lollipop)
        )

        // Configure RecyclerView with a layout manager
        androidVersionRecyclerView.layoutManager = LinearLayoutManager(this)

        // Link RecyclerView to adapter
        androidVersionRecyclerView.adapter = AndroidVersionAdapter(androidVersionArray)
    }
}
