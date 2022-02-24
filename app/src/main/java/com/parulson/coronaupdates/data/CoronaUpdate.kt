package com.parulson.coronaupdates.data

import com.google.gson.annotations.SerializedName

data class CoronaUpdate(
    /*val cases: Int?,
    val todayCases: Int?,
    val deaths: Int?,
    val recovered: Int?*/
    @SerializedName("author")
    val author: String?,
    @SerializedName("content")
    val content: String?
)
