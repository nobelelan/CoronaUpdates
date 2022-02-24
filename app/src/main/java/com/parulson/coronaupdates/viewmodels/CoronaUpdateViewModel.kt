package com.parulson.coronaupdates.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.parulson.coronaupdates.data.CoronaUpdate
import com.parulson.coronaupdates.repositories.CoronaUpdateRepository
import kotlinx.coroutines.launch

class CoronaUpdateViewModel(
    private val repository: CoronaUpdateRepository
    ): ViewModel() {

    /*val coronaUpdate: MutableLiveData<CoronaUpdate> = MutableLiveData()
    fun getCoronaUpdate(*//*yesterdayUpdate: String*//*) = viewModelScope.launch {
        repository.getCoronaUpdate(*//*yesterdayUpdate*//*)
    }*/

    val breakingNews: MutableLiveData<CoronaUpdate> = MutableLiveData()
    fun getBreakingNews(countryCode: String, pageNumber: Int) = viewModelScope.launch {
        repository.getBreakingNews(countryCode,pageNumber)
    }
}