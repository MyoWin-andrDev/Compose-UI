package com.learning.composeui.components.appBar.top_app_bar

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import com.learning.composeui.components.appBar.list.ListItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SmallTopAppBar_() {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                ),
                title = {
                    Text("Small Top App Bar")
                }
            )
        }
    ){ innerPadding ->
        ListItem(innerPadding)
    }
}
