package com.example.consumerestapi.ui.home.screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.consumerestapi.repository.KontakRepository

class InsertViewModel (private  val kontakRepository: KontakRepository) : ViewModel () {

    var insertKontakState by mutableStateOf(InsertUiState())
        private set

    fun updateInsertKontakState(insertUiEvent: InsertUiEvent){
        insertKontakState = InsertUiState(insertUiEvent = insertUiEvent)
}
    suspend fun insertKontak(){


    }    }