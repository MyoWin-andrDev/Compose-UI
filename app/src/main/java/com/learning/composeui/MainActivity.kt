package com.learning.composeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.learning.composeui.components.button.icon_button.ToggleIconButtonExample
import com.learning.composeui.components.button.segment_button.SingleChoiceSegmentedButton
import com.learning.composeui.components.card.AdvancedCard
import com.learning.composeui.components.card.CardExample
import com.learning.composeui.components.check_box.CheckBoxExample
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
                //AppBarMultiSelectionExample()
                //BasicBadge()
                //DetailsBadge()
                //BottomSheet()
                //BasicBt()
                //FloatingActionButton()
                //ToggleIconButtonExample()
                //SingleChoiceSegmentedButton()
                //CardExample()
                //AdvancedCard()
                CheckBoxExample()
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