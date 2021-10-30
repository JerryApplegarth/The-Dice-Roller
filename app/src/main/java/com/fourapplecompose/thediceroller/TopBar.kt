package com.fourapplecompose.thediceroller

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TopBar(){
    TopAppBar(

    ) {
        Text(
            text ="The Rice Roller",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier

                .padding(start = 10.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
    TopBar()
}