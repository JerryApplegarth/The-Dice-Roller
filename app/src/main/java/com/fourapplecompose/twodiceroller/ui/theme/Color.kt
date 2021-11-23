package com.fourapplecompose.twodiceroller.ui.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)


val LightGray = Color(0xffe0e0e0)
val MediumGray = Color(0xff9c9c9c)
val DarkGray = Color(0xff141414)

val LowPriorityColor = Color(0xFF00c980)
val MediumPriorityColor = Color(0xFFffc114)
val HighPriorityColor = Color(0xFFff4646)
val NonePriorityColor = MediumGray

val Green200 = Color(0xffcfff95)
val Green500 = Color(0xff9ccc65)
val Green700 = Color(0xff6b9b37)
val DarkGreen200 = Color(0xffaee571)
val DarkGreen500 = Color(0xff7cb342)
val DarkGreen700 = Color(0xff4b830d)


val FullWhite = Color(0xffffffff)
val FullBlack = Color(0xff000000)


val Colors.splashScreenBackground: Color
    @Composable
    get() = if (isLight) Green700 else DarkGreen700


val Colors.taskItemTextColor: Color
    @Composable
    get() = if (isLight) FullBlack else DarkGreen500

val Colors.taskItemBackgroundColor: Color
    @Composable
    get() = if (isLight) Color.White else DarkGray

val Colors.fabBackgroundColor: Color
    @Composable
    get() = if (isLight) Green700 else DarkGreen700


val Colors.topAppBarContentColor: Color
    @Composable
    get() = if (isLight) FullBlack else FullWhite

val Colors.topAppBarBackgroundColor: Color
    @Composable
    get() = if (isLight) DarkGreen700 else Green500

val Colors.backgroundColor: Color
    @Composable
    get() = if (isLight) LightGray else Green500
