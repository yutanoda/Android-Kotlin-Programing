package com.dotinstall.kotlinhelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    fun sum2number(a: Int, b: Int):Int{
        return a + b;
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnPlayString.setOnClickListener {
            val x = 11
            when(x)
            {
                10 -> Log.d("WHEN", "x == 10")
                else ->{
                    Log.d("WHEN", "x != 10")
                }
            }
        }
    }
}
//