package com.example.incrowdsportkotlinapp.models.stats


import com.google.gson.annotations.SerializedName

data class BookingDetails(
    @SerializedName("player")
    val player: PlayerXXX,
    @SerializedName("type")
    val type: String
)