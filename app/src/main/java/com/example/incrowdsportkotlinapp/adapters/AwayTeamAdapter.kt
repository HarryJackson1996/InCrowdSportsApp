package com.example.incrowdsportkotlinapp.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.incrowdsportkotlinapp.R
import com.example.incrowdsportkotlinapp.models.stats.Stats
import kotlinx.android.synthetic.main.home_team_player_item.view.*

class AwayTeamAdapter(private val stats: Stats, val context: Context) : RecyclerView.Adapter<AwayTeamAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.away_team_player_item,
                parent, false))
    }

    override fun getItemCount(): Int = stats.data.awayTeam.players.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.player_name.text = stats.data.awayTeam.players.get(position).firstName + " " + stats.data.awayTeam.players.get(position).lastName
        holder.itemView.number_text.text = stats.data.awayTeam.players.get(position).shirtNumber.toString()

        holder.itemView.setOnClickListener(View.OnClickListener {
                Log.i("Away Team Player Stats", stats.data.awayTeam.players.get(position).playerStats.toString())
        })
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)

}

