package com.l0122075.humamalwi.responsi1.ui.dashboard

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.l0122075.humamalwi.responsi1.DetailAdapter
import com.l0122075.humamalwi.responsi1.DetailDataClass
import com.l0122075.humamalwi.responsi1.R


class DetailActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.detail_kru)
        val image = intent.getIntExtra("IMAGE", 0)
        val title = intent.getStringExtra("TITLE")
        val description = intent.getStringExtra("DESCRIPTION")
        val Detail = intent.getParcelableArrayListExtra<DetailDataClass>("DETAIL_LIST")

        val imageView: ImageView = findViewById(R.id.imageDetail)
        val titleView: TextView = findViewById(R.id.titleDetail)
        val descriptionView: TextView = findViewById(R.id.desDetail)

        imageView.setImageResource(image)
        titleView.text = title
        descriptionView.text = description

        val detailRecyclerView: RecyclerView = findViewById(R.id.details)
        detailRecyclerView.layoutManager = GridLayoutManager(this, 2)
        detailRecyclerView.adapter = DetailAdapter(Detail ?: ArrayList())


    }
}