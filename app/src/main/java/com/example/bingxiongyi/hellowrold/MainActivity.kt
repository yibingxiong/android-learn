package com.example.bingxiongyi.hellowrold

import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.GridLayout
import android.widget.ImageView
import android.widget.LinearLayout

class MainActivity : Activity() {

    private var chars = arrayOf("7", "8", "9", "➗",
        "4", "5", "6", "x",
        "1", "2", "3", "-",
        ".", "0", "=", "+"
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gridLayout = findViewById<GridLayout>(R.id.root)
        for (i in chars.indices) {
            val btn = Button(this)
            btn.text = chars[i]
            btn.textSize = 40F
            btn.setPadding(5, 35, 5, 35)
            val rosSpec = GridLayout.spec(i / 4 + 2)
            val columnSpec = GridLayout.spec(i % 4)
            val params = GridLayout.LayoutParams(rosSpec, columnSpec)
            params.setGravity(Gravity.FILL)
            gridLayout.addView(btn, params)
        }
    }
}
