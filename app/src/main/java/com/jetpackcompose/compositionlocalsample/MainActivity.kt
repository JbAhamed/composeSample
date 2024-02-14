package com.jetpackcompose.compositionlocalsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jetpackcompose.compositionlocalsample.screens.WelcomeScreen
import com.jetpackcompose.compositionlocalsample.ui.theme.CompositionLocalSampleTheme
import com.softzino.autoofix.base.utils.analyticslogger.AnalyticsLogger
import com.softzino.autoofix.base.utils.analyticslogger.LocalAnalyticsLogger
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * Main activity
 *
 * @constructor Create empty Main activity
 */
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    /**
     * Analytics logger
     */
    @Inject
    protected lateinit var analyticsLogger: AnalyticsLogger


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CompositionLocalProvider(LocalAnalyticsLogger provides analyticsLogger) {
                CompositionLocalSampleTheme {
                    // A surface container using the 'background' color from the theme
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        WelcomeScreen()
                    }
                }
            }
        }
    }
}

/**
 * A function that multiplies two numbers.
 *
 * @param a The first number.
 * @param b The second number.
 * @return The product of `a` and `b`.
 */
fun multiply(a: Int, b: Int): Int {
    return a * b
}

/**
 * Greeting this is function that is use for compose default project.
 *
 * @param name it is just a parameter of this [Greeting] function.
 */
@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
        color = MaterialTheme.colorScheme.primary,
        style = MaterialTheme.typography.bodyLarge,
    )
}

/**
 * Greeting preview
 *
 */
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CompositionLocalSampleTheme {
        Greeting("Android")
    }
}