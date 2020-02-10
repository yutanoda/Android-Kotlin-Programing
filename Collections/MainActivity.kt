package com.dotinstall.kotlinhelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnPlayString.setOnClickListener {

            val numbers = mutableListOf<Int>(1,2,3,4,5)
            /*
            for(i in numbers)
                Log.d("number",i.toString())

            numbers.add(6)
            Log.d("After change","")
            for(i in numbers)
                Log.d("number",i.toString())
            */
            /*
            Log.d("FIRST ITEM",numbers.first().toString())
            Log.d("FIRST ITEM",numbers.last().toString())
            Log.d("FIRST ITEM",numbers.filter { it % 2 != 0}.toString())
             */
            /*
            val noDuplicate = hashSetOf<String>("a","b","c","c","d")
            for(item in noDuplicate.toSortedSet())
                Log.d("ITEM",item)
             */
            val myHashMap = hashMapOf<String,Int>("First" to 1,"Second" to 2)
            Log.d("ITEM",myHashMap["First"].toString())
            Log.d("ITEM",myHashMap["Second"].toString())

        }
    }
}
//