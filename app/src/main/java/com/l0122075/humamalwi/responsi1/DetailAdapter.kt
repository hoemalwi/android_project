package com.l0122075.humamalwi.responsi1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DetailAdapter(private val detailList: ArrayList<DetailDataClass>) :
    RecyclerView.Adapter<DetailAdapter.DetailViewHolder>() {

    inner class DetailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imagedetailvw)
        val nameTextView: TextView = itemView.findViewById(R.id.titledetailvw)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.krulist2, parent, false)
        return DetailViewHolder(view)
    }

    override fun onBindViewHolder(holder: DetailViewHolder, position: Int) {
        val detailData = detailList[position]
        holder.imageView.setImageResource(detailData.image)
        holder.nameTextView.text = detailData.name
    }

    override fun getItemCount(): Int {
        return detailList.size
    }
}