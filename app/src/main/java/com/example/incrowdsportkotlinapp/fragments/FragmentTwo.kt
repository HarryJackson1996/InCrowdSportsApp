package com.example.incrowdsportkotlinapp.fragments

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.incrowdsportkotlinapp.R
import com.example.incrowdsportkotlinapp.StatsAPI
import com.example.incrowdsportkotlinapp.adapters.AwayTeamAdapter
import com.example.incrowdsportkotlinapp.adapters.HomeTeamAdapter
import com.google.gson.GsonBuilder
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.internal.schedulers.IoScheduler
import kotlinx.android.synthetic.main.fragment_fragment_two.*
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class FragmentTwo : Fragment() {

    companion object {
        fun newInstance() = FragmentTwo()
    }

    private lateinit var viewFragment: StatsViewFragment

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fragment_two, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewFragment = ViewModelProviders.of(this).get(StatsViewFragment::class.java)
        // TODO: Use the ViewModel

        fetchCommentary()


    }

    private fun fetchCommentary() {

        recycler_view_home_team.layoutManager = LinearLayoutManager(this.context)
        recycler_view_away_team.layoutManager = LinearLayoutManager(this.context)

        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .baseUrl("https://api.myjson.com/").build()

        val postsApi = retrofit.create(StatsAPI::class.java)

        var response = postsApi.getStatList()


        response.observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(IoScheduler())
            .subscribe {
                recycler_view_home_team.adapter = HomeTeamAdapter(it, activity!!.applicationContext)
                recycler_view_away_team.adapter = AwayTeamAdapter(it, activity!!.applicationContext)
                frag2_home_team_name.text = it.data.homeTeam.name
                frag2_away_team_name.text = it.data.awayTeam.name
                frag2_home_possession.text = it.data.homeTeam.teamStats.possession.toString()
                frag2_away_possession.text = it.data.awayTeam.teamStats.possession.toString()
            }
    }

}
