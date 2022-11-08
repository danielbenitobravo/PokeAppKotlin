package com.example.pokeappkotlin

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokeappkotlin.databinding.ActivityPokedexBinding

class PokedexActivity : Activity() {

    private lateinit var binding: ActivityPokedexBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPokedexBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val pokeRecycler: RecyclerView = findViewById(R.id.pokeRecycler)
        pokeRecycler.layoutManager = LinearLayoutManager(this)
        val pokeData = ArrayList<PokeData>()
        for (i in 1..20) {
            pokeData.add(PokeData(R.drawable.app_icon, "Magikarp", "Water", "Flying"))
        }
        val pokeAdapter: PokeAdapter = PokeAdapter(pokeData)
        pokeRecycler.adapter = pokeAdapter

    }
}