package com.example.recipebookapp.ui.viewModels

import androidx.compose.runtime.MutableState
import androidx.lifecycle.ViewModel
import com.example.recipebookapp.ui.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CategpryViewModel: ViewModel() {
    private val _uiState= MutableStateFlow(UiState())
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()

    fun updateSelectedCategory(updatedText:String,updateId:Int){
        _uiState.update {
            it.copy(
                selectedCategory = updatedText
            )
        }
    }

    fun updateRecipe(updatetext:String){
        _uiState.update {
            it.copy(
                selectedRecipe = updatetext
            )
        }
    }
}