package com.aniketto.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tvPerson = findViewById<TextView>(R.id.tvPerson)
        val person = intent.getSerializableExtra("EXTRA_PERSON") as Person

        tvPerson.text = person.toString()
    }
}