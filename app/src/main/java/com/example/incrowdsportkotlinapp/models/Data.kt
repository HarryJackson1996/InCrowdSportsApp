package com.example.incrowdsportkotlinapp.models


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("awayScore")
    val awayScore: Int,
    @SerializedName("awayTeamId")
    val awayTeamId: String,
    @SerializedName("awayTeamName")
    val awayTeamName: String,
    @SerializedName("commentaryEntries")
    val commentaryEntries: List<CommentaryEntry>,
    @SerializedName("competition")
    val competition: String,
    @SerializedName("competitionId")
    val competitionId: Int,
    @SerializedName("feedMatchId")
    val feedMatchId: Int,
    @SerializedName("homeScore")
    val homeScore: Int,
    @SerializedName("homeTeamId")
    val homeTeamId: String,
    @SerializedName("homeTeamName")
    val homeTeamName: String,
    @SerializedName("id")
    val id: String
)