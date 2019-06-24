package com.example.incrowdsportkotlinapp.models.stats


import com.google.gson.annotations.SerializedName

data class PlayerXXX(
    @SerializedName("firstName")
    val firstName: String,
    @SerializedName("lastName")
    val lastName: String,
    @SerializedName("playerId")
    val playerId: Int
)