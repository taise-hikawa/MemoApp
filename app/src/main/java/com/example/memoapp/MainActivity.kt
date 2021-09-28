package com.example.memoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list = findViewById<ListView>(R.id.list)
        val listContent = mutableListOf("test")
        val adapter = ArrayAdapter(this@MainActivity, android.R.layout.simple_list_item_1, listContent)
        list.adapter = adapter
    }
}