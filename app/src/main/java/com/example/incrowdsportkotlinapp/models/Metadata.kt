package com.example.incrowdsportkotlinapp.models


import com.google.gson.annotations.SerializedName

data class Metadata(
    @SerializedName("createdAt")
    val createdAt: String
)