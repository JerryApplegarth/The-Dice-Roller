package com.fourapplecompose.twodiceroller

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.fourapplecompose.twodiceroller.ui.theme.TheDiceRollerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TheDiceRollerTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    MainScreen()

                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    TheDiceRollerTheme {
        Scaffold(

        ) {

        }
        DiceRoll()
        TopBar()
    }


}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}
