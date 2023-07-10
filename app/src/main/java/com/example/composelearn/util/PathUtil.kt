package com.example.composelearn.util

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Path
import java.lang.Math.abs

/*
 * Created by Sudhanshu Kumar on 05/07/23.
 */

fun Path.standardQuadFromTo(from: Offset, to: Offset) {
    quadraticBezierTo(
        from.x,
        from.y,
        abs(from.x + to.y) / 2f,
        abs(from.y + to.y) / 2f
    )
}