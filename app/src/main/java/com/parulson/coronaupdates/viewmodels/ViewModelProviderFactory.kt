package com.parulson.coronaupdates.viewmodels

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.parulson.coronaupdates.repositories.CoronaUpdateRepository

class ViewModelProviderFactory(
    val coronaUpdateRepository: CoronaUpdateRepository
): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CoronaUpdateViewModel(coronaUpdateRepository) as T
    }
}