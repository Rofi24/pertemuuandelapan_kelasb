package com.example.pertemuuandelapan_kelasb

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ContactViewModel : ViewModel() {
    private val _stateUI = MutableStateFlow(ContactUIState())
    val stateUI: StateFlow<ContactUIState> = _stateUI.asStateFlow()

    fun setContact(ListData: MutableList<String>){
        _stateUI.update { stateSaatIni ->
            stateSaatIni.copy(
                nama = ListData[0],
                alamat = ListData[1],
                telpon = ListData[2]

            )
        }
    }
}