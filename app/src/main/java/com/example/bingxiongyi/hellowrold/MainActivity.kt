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
        // 获取LinearLayout布局容器
        val main = findViewById<LinearLayout>(R.id.root)
        // 程序创建ImageView组件
        val image = ImageView(this)
        image.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT)
        // 将ImageView组件添加到LinearLayout布局容器中
        main.addView(image)
        // 初始化时显示第一张图片
        image.setImageResource(images[0])

        val draw = DrawView(this)
        draw.minimumWidth = 300
        draw.minimumHeight = 500
        main.addView(draw)
    }

}
