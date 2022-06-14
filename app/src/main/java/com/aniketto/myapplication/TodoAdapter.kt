package com.aniketto.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class TodoAdapter (
    var todos:List<Todo>
        ) : RecyclerView.Adapter<TodoAdapter.TOdoViewHolder>()  {
    inner class TOdoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TOdoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo , parent , false)
        return TOdoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return todos.size
    }

    override fun onBindViewHolder(holder: TOdoViewHolder, position: Int) {
        holder.itemView.apply {
        val tvTitle = todos[position].title
         val cbDone = todos[position].isChecked
        }
    }
}