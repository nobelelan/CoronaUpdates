package com.parulson.coronaupdates.repositories

import com.parulson.coronaupdates.api.RetrofitInstance

class CoronaUpdateRepository {

    /*suspend fun getCoronaUpdate(*//*yesterdayUpdate: String*//*) =
        RetrofitInstance.api.getCoronaUpdate(*//*yesterdayUpdate*//*)*/

    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)
}