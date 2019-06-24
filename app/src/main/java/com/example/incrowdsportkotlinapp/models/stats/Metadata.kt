package com.example.incrowdsportkotlinapp.models.stats


import com.google.gson.annotations.SerializedName

data class Metadata(
    @SerializedName("createdAt")
    val createdAt: String
)