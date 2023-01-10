package com.example.recyclerviewexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var layoutManager:RecyclerView.LayoutManager?=null
    var adapter:RecyclerView.Adapter<RecyclerViewAdapter.ViewHoldera>?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title="Programming Languages"

        layoutManager=LinearLayoutManager(this@MainActivity)
        recyclerView.layoutManager=layoutManager
        adapter=RecyclerViewAdapter()
        recyclerView.adapter=adapter
    }
    fun aktiviteDegistir(view: View){

        val intent= Intent(applicationContext,AciklamaEkrani::class.java)
        startActivity(intent)
    }
}