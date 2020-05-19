package com.airkit.bug

class BugHere {
    private fun bugHappensHere(type: MetricSource) {
        // in order to replicate the bug, delete the two casts "as MetricInfoTable<*>" and trigger autocomplete using the table variable
        val table: MetricInfoTable<*> = when (type) {
            MetricSource.CUSTOM -> CustomMetricInfoTable.CUSTOM_METRIC_INFO as MetricInfoTable<*>
            MetricSource.DEFAULT -> DefaultMetricInfoTable.DEFAULT_METRIC_INFO as MetricInfoTable<*>
        }
        println(table)
    }
}
