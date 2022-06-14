package com.aniketto.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), NewsItemClicked {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.rv1)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val items = fetchData()
        val adapter: NewsListAdapter= NewsListAdapter(items ,  this)
        recyclerView.adapter = adapter
        }

    override fun onItemClicked(item: String) {
        Toast.makeText(this , "clicked item is $item" , Toast.LENGTH_SHORT).show()
    }
}

private fun fetchData() : ArrayList<String>{
    val list = ArrayList<String>()
    for (i in 0 until 21){
        list.add("Items $i")
    }
    return list
}
