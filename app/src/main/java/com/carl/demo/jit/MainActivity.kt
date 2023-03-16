package com.carl.demo.jit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.carl.demo.share.Logger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Logger.e("test share module")
    }
}