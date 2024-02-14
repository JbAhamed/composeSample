package com.softzino.autoofix.base.utils.analyticslogger

import android.util.Log
import javax.inject.Inject

class AnalyticsLoggerImpl @Inject constructor() : AnalyticsLogger {
    override fun logEvent(name: String, params: List<AnalyticsParam>) {
        // actual implementation via firebase or newrelic or any other

        Log.d("Log404", "------------" + name + " __  " + params[0].value)
    }
}
