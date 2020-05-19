In order to replicate the bug:

1. Install IntelliJ IDEA 2020
1. Use kotlin plugin 1.3.71 or better
1. Open [BugHere.kt](./bug-example/src/main/kotlin/com/airkit/bug/BugHere.kt)
1. Remove the two typecasts (`as MetricInfoTable<*>`) - shown below
1. Trigger autocomplete of some sort

```kotlin
val table: MetricInfoTable<*> = when (type) {
    MetricSource.CUSTOM -> CustomMetricInfoTable.CUSTOM_METRIC_INFO
    MetricSource.DEFAULT -> DefaultMetricInfoTable.DEFAULT_METRIC_INFO
}
```
