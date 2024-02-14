package com.softzino.autoofix.base.utils.analyticslogger

interface AnalyticsLogger {
    fun logEvent(name: String, params: List<AnalyticsParam>)
}

data class AnalyticsParam(val name: String, val value: String)

fun AnalyticsLogger.logScreenVisited(screenName: String) {
    logEvent(
        "screenViewed",
        listOf(
            AnalyticsParam("screen_name", screenName)
        )
    )
}
