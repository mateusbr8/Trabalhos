package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val imgs:IntArray = intArrayOf(
        R.drawable. ic_launcher_background,
        R.mipmap.ic_launcher,
        R.mipmap.ic_launcher,
        R.mipmap.ic_launcher,
        R.mipmap.ic_launcher,
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        carousel_view.pageCount = imgs.size
        carousel_view.setImageListener { position, imageView ->
            imageView.setImageResource(imgs[position])
        }


        
    }
}