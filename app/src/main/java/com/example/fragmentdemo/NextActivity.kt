package com.example.fragmentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        var name = intent.getStringExtra("Name")

        Toast.makeText(this, name , Toast.LENGTH_SHORT).show()
    }
}