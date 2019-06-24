package com.example.incrowdsportkotlinapp.models


import com.google.gson.annotations.SerializedName

data class CommentaryData(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("metadata")
    val metadata: Metadata,
    @SerializedName("status")
    val status: String
)