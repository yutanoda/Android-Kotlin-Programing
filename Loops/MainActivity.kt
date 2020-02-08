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
            /* for loop
            val items = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
            for ((index,value) in items.withIndex())
                Log.d("Debug","index : $index = $value")
             */
            /*while loop
            var x = 0;
            while(x<10)
            {
                Log.d("Debug", ""+ x)
                x++
            }
             */
            //Do-while loop
            var x = 0
            do {
                Log.d("Debug",""+ x)
                x++
            } while (x < 10)
        }
    }
}
//