package com.learning.composeui.components.button.floating_action_button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun FloatingActionButton(){
    Scaffold(
        modifier = Modifier.fillMaxSize(),
    ){ contentPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(contentPadding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            NormalFloatingActionButton()
            Spacer(modifier = Modifier.height(16.dp))
            SmallFloatingActionButton()
            Spacer(modifier = Modifier.height(16.dp))
            LargeFloatingActionButton()
            Spacer(modifier = Modifier.height(16.dp))
            ExtendedFloatingActionButton()
        }
    }
}

@Composable
fun NormalFloatingActionButton(){
    FloatingActionButton(
        onClick = {},
        containerColor = MaterialTheme.colorScheme.primaryContainer,
        contentColor = MaterialTheme.colorScheme.primary
    ) {
        Icon(
            imageVector = Icons.Filled.Add,
            contentDescription = null

        )
    }
}

@Composable
fun SmallFloatingActionButton(){
    SmallFloatingActionButton(
        onClick = {},
        containerColor = MaterialTheme.colorScheme.primaryContainer,
        contentColor = MaterialTheme.colorScheme.primary
    ) {
        Icon(
            imageVector = Icons.Filled.Add,
            contentDescription = null
        )
    }
}

@Composable
fun LargeFloatingActionButton(){
    LargeFloatingActionButton(
        onClick = {},
        shape = CircleShape,
        containerColor = MaterialTheme.colorScheme.primaryContainer,
        contentColor = MaterialTheme.colorScheme.primary
    ) {
        Icon(
            imageVector = Icons.Filled.Add,
            contentDescription = null
        )
    }
}

@Composable
fun ExtendedFloatingActionButton(){
    ExtendedFloatingActionButton(
        onClick = {},
        icon = { Icon(Icons.Filled.Edit, contentDescription = null) },
        text = { Text("Edit Here" ) },
        containerColor = MaterialTheme.colorScheme.primaryContainer,
        contentColor = MaterialTheme.colorScheme.primary
    )
}