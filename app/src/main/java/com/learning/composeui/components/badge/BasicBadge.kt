package com.learning.composeui.components.badge

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun BasicBadge(){
   Scaffold(
       modifier = Modifier
   ) { innerPadding ->
       BadgedBox(
           modifier = Modifier.padding(innerPadding),
           badge = {
               Badge()
           }
       ) {
           Icon(Icons.Filled.Email, "Email")
       }
   }
}