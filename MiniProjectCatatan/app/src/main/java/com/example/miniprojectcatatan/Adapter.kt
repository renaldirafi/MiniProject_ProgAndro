package com.example.miniprojectcatatan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.miniprojectcatatan.model.User

class Adapter(private val userList:ArrayList<User>) : RecyclerView.Adapter<Adapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return MyViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentitem = userList[position]
        holder.judul.text = currentitem.judul
        holder.content.text = currentitem.content
    }

    override fun getItemCount(): Int {
        return userList.size
    }
    class MyViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        val judul: TextView = itemView.findViewById(R.id.txv_judul)
        val content : TextView=itemView.findViewById(R.id.txv_content)
    }
}