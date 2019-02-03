package com.br.natanfelipe.wcteams.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.br.natanfelipe.wcteams.databinding.TeamItemLayoutBinding
import com.br.natanfelipe.wcteams.interfaces.AdapterContract
import com.br.natanfelipe.wcteams.model.Teams


class TeamsAdapter(val context: Context, var items: List<Teams>) : RecyclerView.Adapter<TeamsAdapter.ViewHolder>(),AdapterContract {

    lateinit var wcTeamsClick: WCTeamsClick

    override fun replaceItems(items: List<*>) {
        this.items = items as List<Teams>
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(context)
        val binding = TeamItemLayoutBinding.inflate(layoutInflater ,parent, false)
        wcTeamsClick = WCTeamsClick()
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //holder.binding.click(wcTeamsClick)
        holder.bind(items[position])
    }

    class ViewHolder(val binding: TeamItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(teams: Teams) {
            binding.team = teams
            binding.executePendingBindings()
        }
    }
}