package com.airkit.bug

import org.jooq.TableRecord
import java.time.LocalDateTime
import java.util.UUID

@Suppress("PLATFORM_CLASS_MAPPED_TO_KOTLIN")
interface MetricInfoDimensionRecord<out R : MetricInfoDimensionRecord<R>> : TableRecord<@UnsafeVariance R> {
    val organizationId: UUID
    val metricId: java.lang.Long
    val firstSeenTime: LocalDateTime
    val lastSeenTime: LocalDateTime
}
