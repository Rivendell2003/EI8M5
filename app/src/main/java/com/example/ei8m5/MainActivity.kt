package com.example.ei8m5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)


        val folderList = List(30) { "Carpeta ${it + 1}" }


        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = FolderAdapter(folderList)
    }
}
