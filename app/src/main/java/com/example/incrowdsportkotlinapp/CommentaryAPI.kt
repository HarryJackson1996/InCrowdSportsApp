package com.example.incrowdsportkotlinapp

import com.example.incrowdsportkotlinapp.models.CommentaryData
import retrofit2.http.GET

interface CommentaryAPI {

    @GET("bins/wqx7p")
    fun getCommentaryList() : io.reactivex.Observable<CommentaryData>

}