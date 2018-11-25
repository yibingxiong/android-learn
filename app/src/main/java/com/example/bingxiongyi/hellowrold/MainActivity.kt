package com.example.bingxiongyi.hellowrold

import android.os.Bundle
import android.os.PersistableBundle
import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    private var images = intArrayOf(R.drawable.java, R.drawable.javaee, R.drawable.swift, R.drawable.ajax, R.drawable.html)
    private var currentImg = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 获取LinearLayout布局容器
        val main = findViewById<LinearLayout>(R.id.root)
        // 程序创建ImageView组件
        val image = ImageView(this)
        image.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT)
        // 将ImageView组件添加到LinearLayout布局容器中
        main.addView(image)
        // 初始化时显示第一张图片
        image.setImageResource(images[0])
        image.setOnClickListener {
            // 改变ImageView里显示的图片
            image.setImageResource(images[++currentImg % images.size])
        }
    }

}
