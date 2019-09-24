package com.anand.test

import android.Manifest
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val x = 2
        val y = 6
        val z = sum(x,y)

       // textView.text = z.toString()

        when(x) {
            2 -> {
            }
            3-> {}
            else -> {}

        }

     button1.setOnClickListener { Toast.makeText(this@MainActivity, "You clicked me.${z.toString()}", Toast.LENGTH_SHORT).show()
         textView.text = z.toString()

     }

    }

    private fun sum(x: Int, y: Int): Int {
        return (x +y)
    }
}
