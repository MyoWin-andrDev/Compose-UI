package com.learning.composeui.components.appBar.dynamic_app_bar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBarSelectionActions(
    selectedItem : Set<Int>,
    modifier : Modifier = Modifier
){
    val hasSelected = selectedItem.isNotEmpty()
    val topBarText : String = if(hasSelected) "Selected ${selectedItem.size}" else "List Item Selected"
    TopAppBar(
        title = {Text(topBarText)},
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary
        ),
        actions = {
            if(hasSelected){
                IconButton(
                    onClick = {}
                ) {
                    Icon(Icons.Filled.Share, "Share")
                }
            }
        }
    )
}