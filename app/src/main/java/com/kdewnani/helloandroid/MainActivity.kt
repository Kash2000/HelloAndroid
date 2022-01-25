package com.kdewnani.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.TextView




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

    }
    fun onAnswerBtn(view : View) {
        val btn = findViewById(R.id.button) as Button;
        val textView = TextView(this)
        btn.setOnClickListener {
            textView.text = getString(R.string.hello_android)
            Toast.makeText(this@MainActivity, textView.text, Toast.LENGTH_SHORT).show()
        }
    }
}