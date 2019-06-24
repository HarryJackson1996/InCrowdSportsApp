package com.example.incrowdsportkotlinapp.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.incrowdsportkotlinapp.R
import com.example.incrowdsportkotlinapp.models.stats.Stats
import kotlinx.android.synthetic.main.home_team_player_item.view.*

class HomeTeamAdapter(private val stats: Stats, val context: Context) : RecyclerView.Adapter<HomeTeamAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.home_team_player_item,
                parent, false))

    }

    override fun getItemCount(): Int = stats.data.homeTeam.players.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.itemView.player_name.text = stats.data.homeTeam.players.get(position).firstName + " " + stats.data.homeTeam.players.get(position).lastName
        holder.itemView.number_text.text = stats.data.homeTeam.players.get(position).shirtNumber.toString()
        holder.itemView.setOnClickListener(View.OnClickListener {
            Log.i("Home Team Player Stats", stats.data.awayTeam.players.get(position).playerStats.toString())
        })
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
}

