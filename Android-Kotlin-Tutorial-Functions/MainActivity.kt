package com.dotinstall.kotlinhelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    fun sum2number(a: Int, b: Int):Int{
        return a + b;
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnSum.setOnClickListener {
            Toast.makeText(this, "" + sum2number(edtNum1.text.toString().toInt(), edtNum2.text.toString().toInt()), Toast.LENGTH_SHORT).show()
        }
    }
}
//