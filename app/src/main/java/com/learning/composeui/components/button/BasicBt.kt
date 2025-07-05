package com.learning.composeui.components.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BasicBt(){
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ){contentPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(contentPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            FilledBt()
            Spacer(modifier = Modifier.height(16.dp))
            FilledTonalBt()
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedBt()
            Spacer(modifier = Modifier.height(16.dp))
            ElevatedBt()
            Spacer(modifier = Modifier.height(16.dp))
            TextBt()
        }
    }
}

@Composable
fun FilledBt(){
    Button(
        onClick = {}
    ) {
        Text(
            text = "Filled Button"
        )
    }
}

@Composable
fun FilledTonalBt(){
    FilledTonalButton(
        onClick = {}
    ) {
        Text("Filled Tonal Button")
    }
}

@Composable
fun OutlinedBt(){
    OutlinedButton(
        onClick = {}
    ) {
        Text("Outlined Button")
    }
}

@Composable
fun ElevatedBt(){
    ElevatedButton(
        onClick = {}
    ) {
        Text("Elevated Button")
    }
}

@Composable
fun TextBt(){
    TextButton(
        onClick = {}
    ) {
        Text("Text Button")
    }
}