package com.example.disneycodechallenge_felix.ui

import android.preference.PreferenceActivity
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
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

@OptIn(ExperimentalFoundationApi::class)
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

        },
        bottomBar = {
            BottomAppBar(
                backgroundColor = white
            ) {
                Button(
                    onClick = {
                        null
                    },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.Blue,
                        contentColor = white
                    ),
                    modifier = Modifier
                        .fillMaxWidth(),
                    shape = CircleShape
                ) {
                    Text(
                        text = "Continue",
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    ) {
        Column (

                ){
            LazyColumn (
                modifier = Modifier
                    .fillMaxHeight(0.5f)

                    ){


                stickyHeader {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 5.dp)
                            .background(Color.White)
                            .size(width = 440.dp, height = 50.dp),
                        verticalAlignment = Alignment.CenterVertically

                    ) {
                        Text(
                            fontSize = 23.sp,
                            fontWeight = FontWeight.Bold,
                            text = "   These guests have reservations"
                        )
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CheckBoxDemo()
                        Text(
                            text = "Jim Jeffrey",
                            fontSize = 16.sp
                        )
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        CheckBoxDemo()
                        Text(
                            text = "Jiminny Cricket",
                            fontSize = 16.sp
                        )
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CheckBoxDemo()
                        Text(
                            text = "Jim Jeffrey",
                            fontSize = 16.sp
                        )
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CheckBoxDemo()
                        Text(
                            text = "Jim Jeffrey",
                            fontSize = 16.sp
                        )
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CheckBoxDemo()
                        Text(
                            text = "Jim Jeffrey",
                            fontSize = 16.sp
                        )
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CheckBoxDemo()
                        Text(
                            text = "Jim Jeffrey",
                            fontSize = 16.sp
                        )
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CheckBoxDemo()
                        Text(
                            text = "Jim Jeffrey",
                            fontSize = 16.sp
                        )
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CheckBoxDemo()
                        Text(
                            text = "Jim Jeffrey",
                            fontSize = 16.sp
                        )
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CheckBoxDemo()
                        Text(
                            text = "Jim Jeffrey",
                            fontSize = 16.sp
                        )
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CheckBoxDemo()
                        Text(
                            text = "Jim Jeffrey",
                            fontSize = 16.sp
                        )
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CheckBoxDemo()
                        Text(
                            text = "Jim Jeffrey",
                            fontSize = 16.sp
                        )
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CheckBoxDemo()
                        Text(
                            text = "Jim Jeffrey",
                            fontSize = 16.sp
                        )
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CheckBoxDemo()
                        Text(
                            text = "Jim Jeffrey",
                            fontSize = 16.sp
                        )
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CheckBoxDemo()
                        Text(
                            text = "Jim Jeffrey",
                            fontSize = 16.sp
                        )
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CheckBoxDemo()
                        Text(
                            text = "Jim Jeffrey",
                            fontSize = 16.sp
                        )
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CheckBoxDemo()
                        Text(
                            text = "Jim Jeffrey",
                            fontSize = 16.sp
                        )
                    }
                }
            }


            LazyColumn {


                stickyHeader {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp)
                            .weight(1f, fill = false)
                    ) {
                        Text(
                            fontSize = 23.sp,
                            fontWeight = FontWeight.Bold,
                            text = "These guests need reservations"
                        )
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CheckBoxDemo()
                        Text(
                            text = "Jim Jeffrey",
                            fontSize = 16.sp
                        )
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        CheckBoxDemo()
                        Text(
                            text = "Jiminny Cricket",
                            fontSize = 16.sp
                        )
                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp)
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

    }
}