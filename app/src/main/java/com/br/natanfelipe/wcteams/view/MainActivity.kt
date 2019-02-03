package com.br.natanfelipe.wcteams.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.br.natanfelipe.wcteams.R
import com.br.natanfelipe.wcteams.adapter.TeamsAdapter
import com.br.natanfelipe.wcteams.viewmodel.TeamsViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var teamsViewModel: TeamsViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        teamsViewModel = TeamsViewModel(this)


        val layoutManager = LinearLayoutManager(this)
        rv.layoutManager = layoutManager
        rv.adapter = TeamsAdapter(this,teamsViewModel.loadFromJsonAssets())
    }
}
