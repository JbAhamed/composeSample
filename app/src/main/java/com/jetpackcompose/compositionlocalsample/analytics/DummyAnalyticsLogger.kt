package com.softzino.autoofix.base.utils.analyticslogger

class DummyAnalyticsLogger : AnalyticsLogger {
    override fun logEvent(name: String, params: List<AnalyticsParam>) = Unit
}
