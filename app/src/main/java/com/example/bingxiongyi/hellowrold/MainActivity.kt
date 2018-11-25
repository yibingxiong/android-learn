package com.example.bingxiongyi.hellowrold

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickHandler (source: View) {
        val tv: TextView = findViewById<TextView>(R.id.show)
        tv.text = "Hello Android-" + java.util.Date()
    }
}
