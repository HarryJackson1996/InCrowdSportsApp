package com.example.incrowdsportkotlinapp.models


import com.google.gson.annotations.SerializedName

data class CommentaryEntry(
    @SerializedName("comment")
    val comment: String,
    @SerializedName("period")
    val period: Int,
    @SerializedName("time")
    val time: String,
    @SerializedName("type")
    val type: String
)