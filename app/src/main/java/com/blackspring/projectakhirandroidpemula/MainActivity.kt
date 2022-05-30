package com.blackspring.projectakhirandroidpemula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.blackspring.projectakhirandroidpemula.adapter.DaftarWisataAdapter

class MainActivity : AppCompatActivity() {

    lateinit var rvWisata: RecyclerView
    private var list: ArrayList<Wisata> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionBar = supportActionBar
        actionBar?.title = "Wisata"

        rvWisata = findViewById(R.id.rv_tempat_wisata)
        rvWisata.setHasFixedSize(true)

        list.addAll(TempatWisataData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.about, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectMode: Int){
        if (selectMode == R.id.about){
            val intent = Intent(this, About::class.java)
            startActivity(intent)
        }
    }

    // show
    private fun showRecyclerList(){
        rvWisata.layoutManager = LinearLayoutManager(this)
        val daftarWisataAdapter = DaftarWisataAdapter(list)
        rvWisata.adapter = daftarWisataAdapter
    }


}