package com.br.natanfelipe.wcteams.adapter

import android.view.View
import android.widget.Toast
import com.br.natanfelipe.wcteams.model.Teams



class WCTeamsClick {
    fun onTeamClickListener(view: View, teams: Teams) {
        Toast.makeText(view.getContext(), teams.name, Toast.LENGTH_SHORT).show()
    }
}