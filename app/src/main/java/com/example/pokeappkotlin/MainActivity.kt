package com.example.pokeappkotlin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.example.pokeappkotlin.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val pokedexButton: Button = findViewById(R.id.btn_pokedex)
        pokedexButton.setOnClickListener {
            val pokedexIntent: Intent = Intent(this, PokedexActivity::class.java)
            startActivity(pokedexIntent)
        }

    }
}