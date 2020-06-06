package com.example.helloprojectinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var img1:ImageView
    private lateinit var bt1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility=View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()
        setContentView(R.layout.activity_main)



        img1=findViewById(R.id.image)
        bt1=findViewById(R.id.button)
        bt1.setOnClickListener(View.OnClickListener {
            window.decorView.systemUiVisibility=View.SYSTEM_UI_FLAG_FULLSCREEN
            var result:Int=(1..6).random()
            var drawableres=when(result)
            {

                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            img1.setImageResource(drawableres)

        })


    }

    override fun onBackPressed() {
        window.decorView.systemUiVisibility=View.SYSTEM_UI_FLAG_FULLSCREEN
        super.onBackPressed()

    }

    override fun onTopResumedActivityChanged(isTopResumedActivity: Boolean) {
        window.decorView.systemUiVisibility=View.SYSTEM_UI_FLAG_FULLSCREEN
        super.onTopResumedActivityChanged(isTopResumedActivity)
    }
}