//[app](../../index.md)/[com.softzino.autoofix.base.utils.analyticslogger](index.md)

# Package-level declarations

## Types

| Name | Summary |
|---|---|
| [AnalyticsLogger](-analytics-logger/index.md) | [androidJvm]<br>interface [AnalyticsLogger](-analytics-logger/index.md) |
| [AnalyticsLoggerImpl](-analytics-logger-impl/index.md) | [androidJvm]<br>class [AnalyticsLoggerImpl](-analytics-logger-impl/index.md)@Injectconstructor : [AnalyticsLogger](-analytics-logger/index.md) |
| [AnalyticsParam](-analytics-param/index.md) | [androidJvm]<br>data class [AnalyticsParam](-analytics-param/index.md)(val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [DummyAnalyticsLogger](-dummy-analytics-logger/index.md) | [androidJvm]<br>class [DummyAnalyticsLogger](-dummy-analytics-logger/index.md) : [AnalyticsLogger](-analytics-logger/index.md) |

## Properties

| Name | Summary |
|---|---|
| [LocalAnalyticsLogger](-local-analytics-logger.md) | [androidJvm]<br>val [LocalAnalyticsLogger](-local-analytics-logger.md): [ProvidableCompositionLocal](https://developer.android.com/reference/kotlin/androidx/compose/runtime/ProvidableCompositionLocal.html)&lt;[AnalyticsLogger](-analytics-logger/index.md)&gt; |

## Functions

| Name | Summary |
|---|---|
| [LogScreenVisited](-log-screen-visited.md) | [androidJvm]<br>@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)<br>fun [LogScreenVisited](-log-screen-visited.md)(screenName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), analyticsLogger: [AnalyticsLogger](-analytics-logger/index.md) = LocalAnalyticsLogger.current) |
| [logScreenVisited](log-screen-visited.md) | [androidJvm]<br>fun [AnalyticsLogger](-analytics-logger/index.md).[logScreenVisited](log-screen-visited.md)(screenName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
