package com.example.disneycodechallenge_felix.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.disneycodechallenge_felix.ui.theme.white

@Composable
fun SelectGuestsScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        modifier = Modifier.fillMaxWidth(),

                        text = "Select Guests",
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold

                    )
                },
                backgroundColor = white,
                navigationIcon = {
                    Icon(Icons.Filled.ArrowBack, null)
                }
            )

        }
    ) {
        Column() {


            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
                Text(
                    fontSize = 23.sp,
                    fontWeight = FontWeight.Bold,
                    text = "These guests have reservations"
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            )
            {

                CheckBoxDemo()
                Text(
                    text = "Jim Jeffrey",
                    fontSize = 16.sp
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            )
            {

                CheckBoxDemo()
                Text(
                    text = "Jiminny Cricket",
                    fontSize = 16.sp
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
                Text(
                    fontSize = 23.sp,
                    fontWeight = FontWeight.Bold,
                    text = "These guests need reservations"
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            )
            {

                CheckBoxDemo()
                Text(
                    text = "Glenda Globson",
                    fontSize = 16.sp
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            )
            {

                CheckBoxDemo()
                Text(
                    text = "Freddy the Frog",
                    fontSize = 16.sp
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Icon(
                    Icons.Filled.Info, null
                )
                Text(
                    text = "At least one Guest in the party must have a reservation. Guests without" +
                            " reservations must remain in the same booking party in order to enter")
            }
        }
    }
}
