package com.jetpackcompose.compositionlocalsample.di


import com.softzino.autoofix.base.utils.analyticslogger.AnalyticsLogger
import com.softzino.autoofix.base.utils.analyticslogger.AnalyticsLoggerImpl

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {

    @Binds
    abstract fun bindAnalyticsLogger(analyticsLoggerImpl: AnalyticsLoggerImpl): AnalyticsLogger

}