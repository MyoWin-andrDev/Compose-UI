package com.learning.composeui.components.check_box

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun CheckBoxExample(){
    var checked by remember { mutableStateOf(true) }

    Scaffold(
        modifier = Modifier.fillMaxSize()
    ){ padding ->
        Column {
            Row(
                modifier = Modifier.padding(padding),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Minimal CheckBox")
                Checkbox(
                    checked = checked,
                    onCheckedChange = { checked = it }
                )
            }
            Text(
                text = if(checked) "Checked " else "Unchecked"
            )
        }
    }
}