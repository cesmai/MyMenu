package com.example.hb.mymenu

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_android_version.view.*

//TODO Macha ecriture un peu obscure

class AndroidVersionAdapter(val items: Array<AndroidVersion>) : RecyclerView.Adapter<AndroidVersionAdapter.ViewHolder>() {

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun bindAndroidVersion(androidVersion: AndroidVersion) {
            with(androidVersion) {
                itemView.androidVersionText.text = name
                itemView.androidVersionImage.setImageResource(imageId)
            }
        }
    }

    // Retourne la visualisation d’une ligne de la liste
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val lineView = LayoutInflater.from(parent.context).inflate(R.layout.item_android_version, parent, false)
        return ViewHolder(lineView)
    }

    // Retourne le nombre d’éléments de la liste
    override fun getItemCount(): Int = items.size

    // Charge les données dans la vue
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindAndroidVersion(items[position])
    }
}