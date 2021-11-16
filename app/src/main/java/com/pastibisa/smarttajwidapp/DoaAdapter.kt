package com.pastibisa.smarttajwidapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class DoaAdapter (val doaList: List<Doa>) : RecyclerView.Adapter <DoaAdapter.DoaVH> () {
    class DoaVH (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var nomorDoa: TextView = itemView.findViewById(R.id.nomor_doa)
        var judulDoa: TextView = itemView.findViewById(R.id.judul_doa)
        var arabicDoa: TextView = itemView.findViewById(R.id.arabic_doa)
        var latinDoa: TextView = itemView.findViewById(R.id.latin_doa)
        var artiDoa: TextView = itemView.findViewById(R.id.arti_doa)
        var linearlayout: LinearLayout = itemView.findViewById(R.id.linear_layout)
        var expandablelayout: LinearLayout = itemView.findViewById(R.id.expandable_layout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoaVH {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_list_doa, parent, false)
        return DoaVH(view)
    }

    override fun onBindViewHolder(holder: DoaVH, position: Int) {
        val doa: Doa = doaList[position]
        holder.nomorDoa.text = doa.nmr
        holder.judulDoa.text = doa.jdl
        holder.arabicDoa.text = doa.arabic
        holder.latinDoa.text = doa.latin
        holder.artiDoa.text = doa.arti

        val isexpandable: Boolean = doaList[position].expandable
        holder.expandablelayout.visibility = if (isexpandable) View.VISIBLE else View.GONE

        holder.linearlayout.setOnClickListener {
            val doaku = doaList[position]
            doaku.expandable = !doaku.expandable
            notifyItemChanged(position)
        }
    }

    override fun getItemCount(): Int = doaList.size
}