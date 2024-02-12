package com.example.filmcatalogappwithretrofitmoshi.util

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

@Composable
fun MySpacer(size: Dp): Unit = Spacer(modifier = Modifier.size(size))

fun String.trimStartEnd() = this.trimStart().trimEnd()