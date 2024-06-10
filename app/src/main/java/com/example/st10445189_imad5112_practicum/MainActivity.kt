package com.example.st10445189_imad5112_practicum

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //declare variables
    private lateinit var textView: TextView
    private lateinit var nameView: TextView
    private lateinit var imageView: ImageView
    private lateinit var button: Button

    @SuppressLint("SuspiciousIdentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //intialise variables
        textView = findViewById(R.id.textView)
        nameView = findViewById(R.id.textView)
        imageView = findViewById(R.id.imageView)
        button = findViewById(R.id.button)


        button.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
            finish()
        }


    }
}