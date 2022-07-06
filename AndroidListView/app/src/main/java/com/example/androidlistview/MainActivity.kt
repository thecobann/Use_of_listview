package com.example.androidlistview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.buttonView_1).setOnClickListener{
            val intent = Intent (this, ListView_One::class.java)
            startActivity(intent)

        }
       findViewById<Button>(R.id.buttonView_2).setOnClickListener{
            val intent = Intent (this, ListView_Two::class.java)
            startActivity(intent)

        }
        findViewById<Button>(R.id.buttonView_3).setOnClickListener{
            val intent = Intent (this, ListView_Three::class.java)
            startActivity(intent)

        }





    }
}