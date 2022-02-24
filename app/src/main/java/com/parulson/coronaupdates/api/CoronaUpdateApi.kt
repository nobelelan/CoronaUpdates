package com.parulson.coronaupdates.api

import com.parulson.coronaupdates.data.CoronaUpdate
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CoronaUpdateApi {

    /*@GET("v3/covid-19/all")
    suspend fun getCoronaUpdate(*//*
        @Query("yesterday")
        yesterdayUpdate: String*//**//*,
        @Query("twoDaysAgo")
        twoDaysAgo: String*//*
    ): CoronaUpdate*/

    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        countryCode: String = "us",
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = "40bd27dec5664f2d9b115adcb7bb3cc8"
    ): CoronaUpdate
}