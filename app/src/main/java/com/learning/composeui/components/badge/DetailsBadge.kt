package com.learning.composeui.components.badge

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun DetailsBadge(){
    var itemCount by remember { mutableStateOf(0) }
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            BadgedBox(
                badge = {
                    Badge(
                        containerColor = Color.Red,
                        contentColor = Color.White
                    ){
                        Text("$itemCount")
                    }
                }

            ) {
                Icon(Icons.Filled.ShoppingCart, "Cart")
            }
            Button(
                onClick = { itemCount++}
            ) {
                Text("Add Item")
            }
        }
    }
}