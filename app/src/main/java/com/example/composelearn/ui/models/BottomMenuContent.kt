package com.example.composelearn.ui.models

import androidx.annotation.DrawableRes

/*
 * Created by Sudhanshu Kumar on 05/07/23.
 */

data class BottomMenuContent(
    val title: String,
    @DrawableRes val iconId: Int
)
