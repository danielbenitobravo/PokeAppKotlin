package com.example.pokeappkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PokeAdapter(private val pokeList: List<PokeData>): RecyclerView.Adapter<PokeAdapter.PokeViewHolder>() {

    override fun onCreateViewHolder(pokeParent: ViewGroup, viewType: Int): PokeViewHolder {
        val pokeView = LayoutInflater.from(pokeParent.context).inflate(R.layout.poke_card, pokeParent, false)
        return PokeViewHolder(pokeView)
    }

    override fun onBindViewHolder(pokeHolder: PokeViewHolder, pokePosition: Int) {
        val pokeData = pokeList[pokePosition]
        pokeHolder.pokeSprite.setImageResource(pokeData.sprite)
        pokeHolder.pokeName.text = pokeData.name
        pokeHolder.pokeType1.text = pokeData.type1
        pokeHolder.pokeType2.text = pokeData.type2
    }

    override fun getItemCount(): Int {
        return pokeList.size
    }

    class PokeViewHolder(pokeItemView: View): RecyclerView.ViewHolder(pokeItemView) {
        val pokeSprite: ImageView = pokeItemView.findViewById(R.id.pokeSprite)
        val pokeName: TextView = pokeItemView.findViewById(R.id.pokeName)
        val pokeType1: TextView = pokeItemView.findViewById(R.id.pokeType1)
        val pokeType2: TextView = pokeItemView.findViewById(R.id.pokeType2)
    }
}