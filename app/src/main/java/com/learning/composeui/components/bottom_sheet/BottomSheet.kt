package com.learning.composeui.components.bottom_sheet

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomSheet(){
    val sheetState = rememberModalBottomSheetState()
    val scope = rememberCoroutineScope()
    var showButtonSheet by remember { mutableStateOf(false) }

    Scaffold(
        floatingActionButton = {
            ExtendedFloatingActionButton(
                text = { Text("Show Bottom Sheet") },
                icon = { Icon(Icons.Filled.KeyboardArrowUp, "Arrow") },
                onClick = {
                    showButtonSheet = true
                }
            )
        }
    ){ contentPadding ->
       if(showButtonSheet){
           ModalBottomSheet(
               modifier = Modifier.padding(contentPadding),
               onDismissRequest = {
                    showButtonSheet = false
               },
               sheetState = sheetState
           ) {
               Box(
                   modifier = Modifier.fillMaxWidth(),
                   contentAlignment = Alignment.Center
               ){
                   Button(
                       onClick = {
                           scope.launch { sheetState.hide() }.invokeOnCompletion {
                               if(!sheetState.isVisible){
                                   showButtonSheet = false
                               }
                           }
                       }
                   ) {
                       Text("Hide Bottom Sheet")
                   }
               }
           }
       }
    }
}