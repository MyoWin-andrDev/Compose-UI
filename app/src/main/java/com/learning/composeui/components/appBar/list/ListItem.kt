package com.learning.composeui.components.appBar.list

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ListItem(innerPadding : PaddingValues){
    LazyColumn(
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()
    ) {
        items(20) { item ->
            Text(
                text = "Item $item",
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}