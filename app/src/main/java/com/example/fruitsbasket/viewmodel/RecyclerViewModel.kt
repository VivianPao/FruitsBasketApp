package com.example.fruitsbasket.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.fruitsbasket.model.Character
import com.example.fruitsbasket.model.DataSource

class RecyclerViewModel: ViewModel() {

    // Gets updated based on what character button is pressed.
    val chosenChar = MutableLiveData<Character>()

    // Should use getters & setters to update ViewModel values!
    fun getData(): Array<Character> {
        return DataSource().getCharInfo()
    }

    fun setChosenChar(char: Character) {
        chosenChar?.value = char
    }

}