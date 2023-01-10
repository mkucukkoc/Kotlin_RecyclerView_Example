package com.example.recyclerviewexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter:RecyclerView.Adapter<RecyclerViewAdapter.ViewHoldera>()
{

    val itemTitles= arrayOf("Kotlin programlama dili nedir?","C# programlama dili nedir?","Java programlama dili nedir?","JavaScipt programlama dili nedir?","Swift programlama dili nedir?")
    val itemDetails= arrayOf("Kotlin ile ilgili daha fazla bilgi edinmek için tıklayınız","C# ile ilgili daha fazla bilgi edinmek için tıklayınız"
        ,"Java ile ilgili daha fazla bilgi edinmek için tıklayınız","Javascript ile ilgili daha fazla bilgi edinmek için tıklayınız","Swift ile ilgili daha fazla bilgi edinmek için tıklayınız")
    val itemImages= intArrayOf(
        R.drawable.kotlin,
        R.drawable.c,
        R.drawable.java1,
        R.drawable.javascript,
        R.drawable.swift3,
    )
      class ViewHoldera (itemView:View): RecyclerView.ViewHolder(itemView)
    {

        var image:ImageView
        var textTitle:TextView
        var textDes:TextView
        init {
            image=itemView.findViewById(R.id.item_image)
            textTitle=itemView.findViewById(R.id.item_title)
            textDes=itemView.findViewById(R.id.item_details)
        }

    }

    override fun onBindViewHolder(holder: ViewHoldera, position: Int) {
      holder.textTitle.text=itemTitles[position]
      holder.textDes.text=itemDetails[position]
      holder.image.setImageResource(itemImages[position])

        holder.itemView.setOnClickListener{
            v:View->
            Toast.makeText(v.context,"Clicked on the item ",Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHoldera {
        val v=LayoutInflater.from(parent.context).inflate(R.layout.recyclerviewmodel,parent,false)
        return ViewHoldera(v)
    }
    override fun getItemCount(): Int {
        return itemTitles.size

    }
}