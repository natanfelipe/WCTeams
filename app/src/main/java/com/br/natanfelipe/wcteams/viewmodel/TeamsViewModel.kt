package com.br.natanfelipe.wcteams.viewmodel

import android.content.Context
import androidx.databinding.ObservableArrayList
import com.br.natanfelipe.wcteams.model.Teams
import org.json.JSONArray

class TeamsViewModel(val context: Context) {
    val teams = ObservableArrayList<Teams>()
    lateinit var json_string: String

    fun loadFromJsonAssets() : ArrayList<Teams> {
        context.assets.open("teams.json").apply {
            json_string = this.readBytes().toString(Charsets.UTF_8)
        }.close()

        val jsonArray = JSONArray(json_string)

        var teams = arrayListOf<Teams>()

        for (i in 0 until jsonArray.length()) {
            val jsonObj = jsonArray.getJSONObject(i)
            val name = jsonObj.getString("name")
            val code = jsonObj.getString("code")
            val crestUrl = jsonObj.getString("crestUrl")
            teams.add(Teams(name,code,crestUrl))
            //teams.add(Teams(name,code))
        }

        return teams
    }

}