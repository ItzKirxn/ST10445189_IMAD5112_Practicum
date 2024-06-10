package com.example.st10445189_imad5112_practicum

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    //declaring variables
    private lateinit var textView1: TextView
    private lateinit var textView2: TextView
    private lateinit var textView3: TextView
    private lateinit var textView4: TextView
    private lateinit var textView5: TextView
    private lateinit var textView6: TextView
    private lateinit var textView7: TextView
    private lateinit var textView8: TextView
    private lateinit var textView9: TextView
    private lateinit var ImageView2: ImageView
    private lateinit var button4: Button


    @SuppressLint("setTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //initialize
        textView1=findViewById(R.id.textView1)
        textView2=findViewById(R.id.textView2)
        textView3=findViewById(R.id.textView3)
        textView4=findViewById(R.id.textView4)
        textView5=findViewById(R.id.textView5)
        textView6=findViewById(R.id.textView6)
        textView7=findViewById(R.id.textView7)
        textView8=findViewById(R.id.textView8)
        textView9=findViewById(R.id.textView9)
        ImageView2=findViewById(R.id.imageView2)
        button4=findViewById(R.id.button4)

        button4.setOnClickListener {
            val intent = Intent(this,DetailedViewScreen::class.java)
            startActivity(intent)
            finish()
        }







    }
}