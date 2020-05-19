package com.airkit.bug

import org.jooq.InsertValuesStep4
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableRecord
import org.jooq.impl.DSL
import java.time.LocalDateTime
import java.util.UUID

@Suppress("PLATFORM_CLASS_MAPPED_TO_KOTLIN")
interface MetricInfoRecord<out R : MetricInfoRecord<R>> : TableRecord<@UnsafeVariance R> {
    val organizationId: UUID
    val metricId: java.lang.Long
    val firstSeenTime: LocalDateTime
    val lastSeenTime: LocalDateTime
}

interface MetricInfoTable<R : MetricInfoRecord<R>> : Table<R> {
    val organizationId: TableField<R, UUID>
    val metricId: TableField<R, Long>
    val firstSeenTime: TableField<R, LocalDateTime>
    val lastSeenTime: TableField<R, LocalDateTime>
}

fun <R : MetricInfoRecord<R>> MetricInfoTable<out R>.insertInto(): MetricInfoInsertValuesStep<out R> =
    DSL.insertInto(
        this,
        organizationId,
        metricId,
        firstSeenTime,
        lastSeenTime
    )

fun <R : MetricInfoRecord<R>> MetricInfoInsertValuesStep<in R>.insertValues(
    organizationId: UUID,
    metricId: Long,
    firstSeenTime: LocalDateTime,
    lastSeenTime: LocalDateTime
): MetricInfoInsertValuesStep<in R> = values(
    organizationId,
    metricId,
    firstSeenTime,
    lastSeenTime
)

typealias MetricInfoInsertValuesStep<R> = InsertValuesStep4<R, UUID, Long, LocalDateTime, LocalDateTime>
