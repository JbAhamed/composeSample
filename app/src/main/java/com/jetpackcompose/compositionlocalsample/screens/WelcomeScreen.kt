package com.jetpackcompose.compositionlocalsample.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.softzino.autoofix.base.utils.analyticslogger.LogScreenVisited

/**
 * Welcome screen
 *
 * @param name
 */
@Composable
fun WelcomeScreen(name:String = "Welcome") {

    Column {
        Text(
            text = "Hello World!",
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.bodyLarge,
        )
    }
    LogScreenVisited(screenName = "Welcome")
}