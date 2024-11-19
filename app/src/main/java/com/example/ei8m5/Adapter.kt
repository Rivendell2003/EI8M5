package com.example.ei8m5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class FolderAdapter(private val folderList: List<String>) : RecyclerView.Adapter<FolderAdapter.FolderViewHolder>() {


    class FolderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.itemTitle)
        val imageView: ImageView = itemView.findViewById(R.id.folderImage)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FolderViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return FolderViewHolder(view)
    }


    override fun onBindViewHolder(holder: FolderViewHolder, position: Int) {
        val folder = folderList[position]
        holder.title.text = folder


        holder.imageView.setImageResource(R.drawable.ic_folder_1)
    }


    override fun getItemCount(): Int {
        return folderList.size
    }
}
