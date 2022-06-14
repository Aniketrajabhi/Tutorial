package com.aniketto.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class NewsListAdapter(private val items :ArrayList<String> , private val listener: NewsItemClicked): RecyclerView.Adapter<NewsViewHolder>() {
     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
         val view =LayoutInflater.from(parent.context).inflate(R.layout.item_todo , parent , false)
         val viewHolder = NewsViewHolder(view)
         view.setOnClickListener{
             listener.onItemClicked(items[viewHolder.absoluteAdapterPosition])
         }
         return NewsViewHolder(view)
     }
     override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
         val currentItems = items[position]
         holder.tvTitle.text = currentItems
     }
     override fun getItemCount(): Int {
         return items.size
     }
 }
class NewsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val tvTitle:TextView = itemView.findViewById(R.id.tvTitle)
}
interface NewsItemClicked{
    fun onItemClicked(item:String)
}
