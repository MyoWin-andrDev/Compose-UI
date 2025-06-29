package com.learning.composeui.components.appBar.dynamic_app_bar

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun AppBarMultiSelectionExample(
    modifier: Modifier = Modifier
){
    val listItem by remember { mutableStateOf(listOf(1,2,3,4,5))}
    var selectedItem by rememberSaveable { mutableStateOf(setOf<Int>()) }
    Scaffold(
        topBar = { AppBarSelectionActions(selectedItem) }
    ) { innerPadding ->
        LazyColumn(
            contentPadding = innerPadding
        )
        {
            itemsIndexed(listItem) { item, index ->
                val isItemSelected = selectedItem.contains(index)
                ListItemSelectable(
                    selected = isItemSelected,
                    modifier = Modifier
                        .combinedClickable(
                            interactionSource = remember { MutableInteractionSource() },
                            indication = null,
                            onClick = {
                                if (selectedItem.isNotEmpty()) { // If we're in selection mode
                                    if (isItemSelected) selectedItem -= index else selectedItem += index
                                }
                            },
                            onLongClick = {
                                if (isItemSelected) selectedItem -= index else selectedItem += index
                            }
                        )
                )
            }
        }
    }
}

@Composable
fun ListItemSelectable(
    selected: Boolean,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        ListItem(
            headlineContent = { Text("Long press to select or deselect item") },
            leadingContent = {
                if (selected) {
                    Icon(
                        Icons.Filled.Check,
                        contentDescription = "Localized description",
                    )
                }
            }
        )
    }
}