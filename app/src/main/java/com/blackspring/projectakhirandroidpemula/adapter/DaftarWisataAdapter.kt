package com.blackspring.projectakhirandroidpemula.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.blackspring.projectakhirandroidpemula.HalamanDetail
import com.blackspring.projectakhirandroidpemula.R
import com.blackspring.projectakhirandroidpemula.Wisata
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DaftarWisataAdapter(val listWisata: ArrayList<Wisata>) : RecyclerView.Adapter<DaftarWisataAdapter.DaftarViewHolder>(){

    inner class DaftarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvNamaWisata: TextView = itemView.findViewById(R.id.tv_nama_wisata)
        var tvDetailWisata: TextView = itemView.findViewById(R.id.tv_detail_wisata)
        var photoWisata: ImageView = itemView.findViewById(R.id.img_wisata)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DaftarWisataAdapter.DaftarViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_wisata, parent, false)
        return DaftarViewHolder(view)
    }

    override fun onBindViewHolder(holder: DaftarViewHolder, position: Int) {
        val wisata = listWisata[position]

        Glide.with(holder.itemView.context)
            .load(wisata.photoWisata)
            .apply(RequestOptions())
            .into(holder.photoWisata)

        holder.tvNamaWisata.text = wisata.tempatWisata
        holder.tvDetailWisata.text = wisata.detailWisata

        val descriptionContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(descriptionContext, HalamanDetail::class.java)
            moveDetail.putExtra(HalamanDetail.EXTRA_NAME, wisata.tempatWisata)
            moveDetail.putExtra(HalamanDetail.EXTRA_DETAIL, wisata.detailWisata)
            moveDetail.putExtra(HalamanDetail.EXTRA_PHOTO, wisata.photoWisata)
            descriptionContext.startActivity(moveDetail)
        }
    }

    override fun getItemCount(): Int {
        return listWisata.size
    }
}