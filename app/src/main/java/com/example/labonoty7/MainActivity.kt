package com.example.labonoty7


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.labs8.R

class MainActivity : AppCompatActivity() {
    private  var counter: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button : Button = findViewById(R.id.button2)
        var textView : TextView = findViewById(R.id.textView)
        button.setOnClickListener{
            textView.text= "Hello, friend!"
            textView.text = "Я нажал на кнопку ${++counter} раз"
        }


    }
}