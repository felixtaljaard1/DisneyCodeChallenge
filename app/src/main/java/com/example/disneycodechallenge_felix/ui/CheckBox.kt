package com.example.disneycodechallenge_felix.ui

import android.widget.CheckBox
import androidx.compose.material.Checkbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun CheckBoxDemo(){
    val checkedState = remember { mutableStateOf(false) }
    Checkbox(
        checked = checkedState.value,
        onCheckedChange = { checkedState.value = it}
    )
}