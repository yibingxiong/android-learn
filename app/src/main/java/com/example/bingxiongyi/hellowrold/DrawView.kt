package com.example.bingxiongyi.hellowrold

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

class DrawView : View {
    private var currentX = 40f
    private var currentY = 50f
    private var p = Paint()
    constructor(context:Context) : super(context)
    constructor(context: Context, set: AttributeSet): super(context, set)

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        p.color = Color.RED
        canvas.drawCircle(currentX, currentY, 15F, p)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        currentX = event.x
        currentY = event.y
        invalidate()
        return true
    }
}