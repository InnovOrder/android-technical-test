package com.innovorder.testtechnique

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(
    private val service: DuckService = RestClient().getDuckService()
) : ViewModel() {

    init {
        getDucks()
    }

    private val _data = MutableLiveData<List<Duck>>()
    val data: LiveData<List<Duck>> = _data

    private fun getDucks() {
        _data.postValue(service.getAllDucks().execute().body()!!.ducks)
    }
}
