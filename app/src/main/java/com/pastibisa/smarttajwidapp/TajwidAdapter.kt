package com.pastibisa.smarttajwidapp

import android.view.LayoutInflater
import android.view.ScrollCaptureCallback
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TajwidAdapter internal constructor(private val listTajwid: ArrayList<Tajwid>): RecyclerView.Adapter<TajwidAdapter.TajwidViewHolder>(){
    inner class TajwidViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var nomor: TextView = itemView.findViewById(R.id.nomor_tajwid)
        var judul: TextView = itemView.findViewById(R.id.judul_tajwid)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TajwidViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_list_tajwid, parent, false)
        return TajwidViewHolder(view)
    }

    override fun onBindViewHolder(holder: TajwidViewHolder, position: Int) {
        val tajwid = listTajwid[position]
        holder.nomor.text = tajwid.nomor
        holder.judul.text = tajwid.judul
        holder.itemView.setOnClickListener{
            onItemClickCallback
                .onItemClick(listTajwid[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int = listTajwid.size

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback{
        fun onItemClick(data: Tajwid)
    }
}
