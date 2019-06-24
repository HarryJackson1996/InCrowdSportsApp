package com.example.incrowdsportkotlinapp


import com.example.incrowdsportkotlinapp.models.stats.Stats
import retrofit2.http.GET

interface StatsAPI {

    @GET("bins/14oi2t")
    fun getStatList() : io.reactivex.Observable<Stats>

}