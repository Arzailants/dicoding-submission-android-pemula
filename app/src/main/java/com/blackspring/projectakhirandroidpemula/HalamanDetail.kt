package com.blackspring.projectakhirandroidpemula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class HalamanDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_detail)
        val actionBar = supportActionBar
        actionBar!!.title = "Detail Tempat Wisata"
        actionBar.setDisplayHomeAsUpEnabled(true)

        // referensi
        val imgWisata: ImageView = findViewById(R.id.photo_wisata)
        val namaWisata: TextView = findViewById(R.id.nama_wisata)
        val detailWisata: TextView = findViewById(R.id.detail_wisata)

        val images = intent.getIntExtra(EXTRA_PHOTO, 0)
        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)

        Glide.with(this)
            .load(images)
            .apply(RequestOptions())
            .into(imgWisata)
        namaWisata.text = name
        detailWisata.text = detail
    }

    companion object{
        const val EXTRA_PHOTO = "extra_age"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}