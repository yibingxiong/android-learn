package com.example.bingxiongyi.hellowrold

import android.app.Activity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout

class MainActivity : Activity() {

    private var images = intArrayOf(R.drawable.java, R.drawable.javaee, R.drawable.swift, R.drawable.ajax, R.drawable.html)
//    private var currentImg = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}
