package com.learning.composeui.components.appBar.top_app_bar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.style.TextOverflow
import com.learning.composeui.components.appBar.list.ListItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CenterAlignedTopBar(){
    val scrollBehaviors = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState()) // For enter .enterAlwaysScrollBehavior()

    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehaviors.nestedScrollConnection),
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                ),
                title = {
                    Text(
                        text = "Center Aligned Top Bar",
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                navigationIcon = {
                    IconButton(
                        onClick = {},
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = null
                        )
                    }
                },
                actions = {
                    IconButton(
                        onClick = {},
                    ) {
                        Icon(
                            imageVector = Icons.Filled.AccountCircle,
                            contentDescription = null
                        )
                    }
                    IconButton(
                        onClick = {},
                    ) {
                        Icon(
                            imageVector = Icons.Filled.AccountBox,
                            contentDescription = null
                        )
                    }
                    IconButton(
                        onClick = {},
                    ) {
                        Icon(
                            imageVector = Icons.Filled.AccountCircle,
                            contentDescription = null
                        )
                    }
                },
                scrollBehavior = scrollBehaviors
            )
        }
    ){ innerPadding ->
        ListItem(innerPadding)
    }
}