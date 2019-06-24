package com.example.incrowdsportkotlinapp.fragments

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.incrowdsportkotlinapp.CommentaryAPI

import com.example.incrowdsportkotlinapp.R
import com.example.incrowdsportkotlinapp.adapters.CommentaryAdapter
import com.google.gson.GsonBuilder
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.internal.schedulers.IoScheduler
import kotlinx.android.synthetic.main.fragment_fragment_one.*
import kotlinx.android.synthetic.main.fragment_fragment_one.recycler_view_commentary
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class FragmentOne : Fragment() {

    companion object {
        fun newInstance() = FragmentOne()
    }

    private lateinit var viewModel: CommentaryViewFragment

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fragment_one, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(CommentaryViewFragment::class.java)
        // TODO: Use the ViewModel

        refreshLayout.setOnRefreshListener {
            fetchCommentary()
        }

        fetchCommentary()
    }

    private fun fetchCommentary() {
        refreshLayout.isRefreshing = true;

        recycler_view_commentary.layoutManager = LinearLayoutManager(this.context)

        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .baseUrl("https://api.myjson.com/").build()


        val postsApi = retrofit.create(CommentaryAPI::class.java)

        var response = postsApi.getCommentaryList()


            response.observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(IoScheduler())
            .subscribe {
                recycler_view_commentary.adapter = CommentaryAdapter(it, activity!!.applicationContext)
                home_team_score.text = it.data.homeScore.toString()
                away_team_score.text = it.data.awayScore.toString()
                frag1_home_team_name.text = it.data.homeTeamName
                frag1_away_team_name.text = it.data.awayTeamName
                refreshLayout.isRefreshing = false;
            }
    }
}
