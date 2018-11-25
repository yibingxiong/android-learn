package com.example.bingxiongyi.hellowrold

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val layout = LinearLayout(this)
        super.setContentView(layout)
        layout.orientation = LinearLayout.VERTICAL
        val show = TextView(this)
        val btn = Button(this)
        btn.setText(R.string.ok)
        btn.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        layout.addView(show)
        layout.addView(btn)
        btn.setOnClickListener {
            show.text = "Hello world, Android, " + java.util.Date()
        }
    }
}
