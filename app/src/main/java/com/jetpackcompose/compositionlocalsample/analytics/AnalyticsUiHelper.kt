package com.softzino.autoofix.base.utils.analyticslogger

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.staticCompositionLocalOf

val LocalAnalyticsLogger = staticCompositionLocalOf<AnalyticsLogger> {
    DummyAnalyticsLogger()
}

@Composable
fun LogScreenVisited(
    screenName: String,
    analyticsLogger: AnalyticsLogger = LocalAnalyticsLogger.current
) = LaunchedEffect(Unit) {
    analyticsLogger.logScreenVisited(screenName)
}
