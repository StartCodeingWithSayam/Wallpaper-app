package com.flaxstudio.wallpaperapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.flaxstudio.wallpaperapp.R

class HomeRecyclerViewAdapter(private val context: Context) : RecyclerView.Adapter<HomeRecyclerViewAdapter.ViewHolder>()  {

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val coverPhoto : ImageView = itemView.findViewById(R.id.coverPhoto)
        val collectionName : TextView = itemView.findViewById(R.id.collection_name)
        val totalImages : TextView = itemView.findViewById(R.id.total_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_collection_item , parent , false)
        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
       return 8
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        Glide.with(context).load(R.drawable.lovingone).into(holder.coverPhoto)

        holder.collectionName.text = "Animals"
        holder.totalImages.text = "1250"


    }
}