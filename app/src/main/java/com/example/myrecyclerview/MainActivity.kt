package com.example.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.RecyclerView
import org.intellij.lang.annotations.JdkConstants.ListSelectionMode

class MainActivity : AppCompatActivity() {
    private lateinit var rvHero: RecyclerView
    private var list: ArrayList<Hero> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvHeroes = findViewById(R.id.rv_heroes)
        rvHeroes.setHasFixedSize(true)

        list.add(HeroesData.listData())
        showRecyclerList()
    }

    private fun showRecyclerList(){
        rvHeroes.layoutManager = LinerLayoutManager(this)
        val listHeroAdapter = ListHeroAdapter(list)
        rvHeroes.setHasFixedSize(true)
    }
}
