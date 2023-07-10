package com.example.composelearn.ui.models

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

/*
 * Created by Sudhanshu Kumar on 05/07/23.
 */

data class Feature(
    val title: String,
    @DrawableRes val iconId: Int,
    val lightColor: Color,
    val mediumColor: Color,
    val darkColor: Color
)