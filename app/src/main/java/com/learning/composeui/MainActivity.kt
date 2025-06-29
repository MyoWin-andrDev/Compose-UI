package com.learning.composeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.learning.composeui.appBar.bottom_app_bar.BottomAppBar_
import com.learning.composeui.appBar.dynamic_app_bar.AppBarMultiSelectionExample
import com.learning.composeui.ui.theme.ComposeUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeUITheme {
                // SmallTopAppBar_()
                //CenterAlignedTopBar()
                //MediumTopAppBar_()
                //BottomAppBar_()
                AppBarMultiSelectionExample()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeUITheme {
    }
}