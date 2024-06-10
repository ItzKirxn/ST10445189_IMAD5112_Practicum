package com.example.st10445189_imad5112_practicum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge

class DetailedViewScreen : AppCompatActivity() {

    //declare
    private lateinit var Closebutton: Button
    private lateinit var textView10: TextView
    private lateinit var BackButton: Button
    private lateinit var TextView11: TextView
    private lateinit var TextView12: TextView
    private lateinit var TextView13: TextView
    private lateinit var TextView14: TextView
    private lateinit var TextView15: TextView
    private lateinit var TextView16: TextView
    private lateinit var TextView17: TextView
    private lateinit var TextView18: TextView
    private lateinit var TextView19: TextView
    private lateinit var TextView20: TextView
    private lateinit var TextView21: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_view_screen)

        //initialize
        Closebutton=findViewById(R.id.Closebutton)
        textView10=findViewById(R.id.textView10)
        BackButton=findViewById(R.id.Backbutton)
        TextView11=findViewById(R.id.textView11)
        TextView12=findViewById(R.id.textView12)
        TextView13=findViewById(R.id.textView13)
        TextView14=findViewById(R.id.textView14)
        TextView15=findViewById(R.id.textView15)
        TextView16=findViewById(R.id.textView16)
        TextView17=findViewById(R.id.textView17)
        TextView18=findViewById(R.id.textView18)
        TextView19=findViewById(R.id.textView19)
        TextView20=findViewById(R.id.textView20)
        TextView21=findViewById(R.id.textView21)

        //use arrayadapter
        val arrayAdapter: ArrayAdapter<*>
        val days = arrayListOf(
            "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"
        )

        BackButton.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }




    }


}
