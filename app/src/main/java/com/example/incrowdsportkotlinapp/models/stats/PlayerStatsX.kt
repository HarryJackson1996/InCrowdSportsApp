package com.example.incrowdsportkotlinapp.models.stats


import com.google.gson.annotations.SerializedName

data class PlayerStatsX(
    @SerializedName("concededShotsOnTargetInsideBox")
    val concededShotsOnTargetInsideBox: Int,
    @SerializedName("concededShotsOnTargetOutsideBox")
    val concededShotsOnTargetOutsideBox: Int,
    @SerializedName("cornersWon")
    val cornersWon: Int,
    @SerializedName("formationPlace")
    val formationPlace: Int,
    @SerializedName("goalsConceded")
    val goalsConceded: Int,
    @SerializedName("goalsConcededInsideBox")
    val goalsConcededInsideBox: Int,
    @SerializedName("minutesPlayed")
    val minutesPlayed: Int,
    @SerializedName("outsideBoxBlocks")
    val outsideBoxBlocks: Int,
    @SerializedName("outsideBoxCentreShots")
    val outsideBoxCentreShots: Int,
    @SerializedName("penaltyGoalsConceded")
    val penaltyGoalsConceded: Int,
    @SerializedName("rightFootShots")
    val rightFootShots: Int,
    @SerializedName("shotsBlocked")
    val shotsBlocked: Int,
    @SerializedName("shotsOnGoal")
    val shotsOnGoal: Int,
    @SerializedName("shotsOnTargetAssists")
    val shotsOnTargetAssists: Int,
    @SerializedName("started")
    val started: Int,
    @SerializedName("throwIns")
    val throwIns: Int,
    @SerializedName("woodworkHits")
    val woodworkHits: Int
)