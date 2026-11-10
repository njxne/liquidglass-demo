package com.njxne.liquidglass.demo.catalog.utils

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable

@Composable
fun BackHandler(
    enabled: Boolean = true,
    onBack: () -> Unit
) {
    BackHandler(enabled, onBack)
}
