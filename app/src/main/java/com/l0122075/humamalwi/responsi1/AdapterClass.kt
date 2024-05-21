package com.l0122075.humamalwi.responsi1

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.l0122075.humamalwi.responsi1.ui.dashboard.DetailActivity

class AdapterClass(private val dataList: ArrayList<DataClass>) :
    RecyclerView.Adapter<AdapterClass.ViewHolderClass>() {

    var onItemClick :((DataClass) -> Unit)? = null
    class ViewHolderClass(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val rvImage: ImageView = itemView.findViewById(R.id.image)
        val rvTitle: TextView = itemView.findViewById(R.id.title)
        val rvDescription: TextView = itemView.findViewById(R.id.description)
        val rvCard: CardView = itemView.findViewById(R.id.kru_card)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.krulist, parent, false)
        return ViewHolderClass(itemView)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentItem = dataList[position]
        holder.rvImage.setImageResource(currentItem.Image)
        holder.rvTitle.text = currentItem.Title
        holder.rvDescription.text = currentItem.Des
        holder.rvCard.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, DetailActivity::class.java).apply {
                putExtra("IMAGE", currentItem.Image)
                putExtra("TITLE", currentItem.Title)
                putExtra("DESCRIPTION", currentItem.Des)
                putParcelableArrayListExtra("DETAIL_LIST", currentItem.Detail)
            }
            context.startActivity(intent)
        }
    }
}