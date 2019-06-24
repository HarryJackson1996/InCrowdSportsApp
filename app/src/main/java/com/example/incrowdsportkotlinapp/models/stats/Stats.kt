package com.example.incrowdsportkotlinapp.models.stats


import com.google.gson.annotations.SerializedName

data class Stats(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("metadata")
    val metadata: Metadata,
    @SerializedName("status")
    val status: String
)