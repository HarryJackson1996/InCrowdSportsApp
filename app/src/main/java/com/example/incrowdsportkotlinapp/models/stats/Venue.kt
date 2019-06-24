package com.example.incrowdsportkotlinapp.models.stats


import com.google.gson.annotations.SerializedName

data class Venue(
    @SerializedName("id")
    val id: Int,
    @SerializedName("location")
    val location: String,
    @SerializedName("name")
    val name: String
)