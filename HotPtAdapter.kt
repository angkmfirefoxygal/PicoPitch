package com.example.picopitch_ver0

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HotPtAdapter(val itemList: ArrayList<HotPtDataClass>) :
    RecyclerView.Adapter<HotPtAdapter.BoardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.hot_recyclerview_item, parent, false)
        return BoardViewHolder(view)
    }

    override fun onBindViewHolder(holder: BoardViewHolder, position: Int) {
        holder.tv_time.text = itemList[position].time
        holder.tv_title.text = itemList[position].title
        holder.tv_name.text = itemList[position].name
        holder.tv_heart.text = itemList[position].heart
    }

    override fun getItemCount(): Int {
        return itemList.count()
    }


    inner class BoardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tv_time = itemView.findViewById<TextView>(R.id.tv_time)
        val tv_title = itemView.findViewById<TextView>(R.id.tv_title)
        val tv_name = itemView.findViewById<TextView>(R.id.tv_name)
        val tv_heart = itemView.findViewById<TextView>(R.id.heart_number)
    }
}
