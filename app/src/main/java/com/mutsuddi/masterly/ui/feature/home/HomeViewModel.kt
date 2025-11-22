package com.mutsuddi.masterly.ui.feature.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mutsuddi.masterly.data.model.Skill
import com.mutsuddi.masterly.ui.navigation.Routes
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

sealed class HomeScreenState{
    object Loading : HomeScreenState()
    data class Success(val skills: List<Skill>) : HomeScreenState()
    data class Error(val message: String) : HomeScreenState()
}

class HomeViewModel:ViewModel() {

    private  val _uiState: MutableStateFlow<HomeScreenState> =
            MutableStateFlow(HomeScreenState.Loading)
    val uiState: StateFlow<HomeScreenState> = _uiState.asStateFlow()

    init {
        loadSkills()
    }

    private fun loadSkills(){
        viewModelScope.launch {
            try{
                _uiState.value= HomeScreenState.Loading
                delay(3000)
                val result = Routes.getSkills()
                _uiState.value = HomeScreenState.Success(result)
            } catch (e: Exception){
                _uiState.value = HomeScreenState.Error(e.message ?: "Unknown Error")

            }
        }
    }
}