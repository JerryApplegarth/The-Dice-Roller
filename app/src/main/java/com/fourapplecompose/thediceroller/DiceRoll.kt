package com.fourapplecompose.thediceroller

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.fourapplecompose.thediceroller.ui.theme.backgroundColor

@Composable
fun DiceRoll() {
    val firstDiceDrawable = remember { mutableStateOf(R.drawable.dice_1) }
    val secondDiceDrawable = remember { mutableStateOf(R.drawable.dice_2) }
    val firstDiceDescription = remember { mutableStateOf("one") }
    val secondDiceDescription = remember { mutableStateOf("two") }


    Column(
        modifier = Modifier
            .background(MaterialTheme.colors.backgroundColor)
            .fillMaxSize()
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                modifier = Modifier.size(150.dp),
                painter = painterResource(id = firstDiceDrawable.value),
                contentDescription = firstDiceDescription.value
            )
            Image(
                modifier = Modifier.size(150.dp),
                painter = painterResource(id = secondDiceDrawable.value),
                contentDescription = secondDiceDescription.value
            )
        }

        Button(
            onClick = {
                roll(
                    firstDiceDrawable,
                    firstDiceDescription,
                    secondDiceDrawable,
                    secondDiceDescription
                )
            },
            modifier = Modifier
                .width(128.dp)
                .padding(vertical = 60.dp)

        ) {
            Text(
                text = stringResource(id = R.string.roll)
            )
        }
    }
}

fun roll(
    firstDiceStat: MutableState<Int>,
    forFirstContentDes: MutableState<String>,
    secondDiceState: MutableState<Int>,
    forSecondContentDes: MutableState<String>
) {

    val firstDiceRoll = (1..6).random()
    val secondDiceRoll = (1..6).random()

    val firstDice = when (firstDiceRoll) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }


    val secondDice = when (secondDiceRoll) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }


    firstDiceStat.value = firstDice
    secondDiceState.value = secondDice

    forFirstContentDes.value = firstDiceRoll.toString()
    forSecondContentDes.value = secondDiceRoll.toString()

}