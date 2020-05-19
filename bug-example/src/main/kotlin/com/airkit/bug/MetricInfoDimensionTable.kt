package com.airkit.bug

import java.time.LocalDateTime
import org.jooq.InsertValuesStep4
import org.jooq.Table
import org.jooq.TableField
import org.jooq.impl.DSL
import java.util.UUID

interface MetricInfoDimensionTable<R : MetricInfoDimensionRecord<R>> : Table<R> {
    val organizationId: TableField<R, UUID>
    val metricId: TableField<R, Long>
    val firstSeenTime: TableField<R, LocalDateTime>
    val lastSeenTime: TableField<R, LocalDateTime>
}

fun <R : MetricInfoDimensionRecord<R>> MetricInfoDimensionTable<out R>.insertInto(): MetricInfoDimensionInsertValuesStep<out R> =
    DSL.insertInto(
        this,
        organizationId,
        metricId,
        firstSeenTime,
        lastSeenTime
    )

fun <R : MetricInfoDimensionRecord<R>> MetricInfoDimensionInsertValuesStep<in R>.insertValues(
    organizationId: UUID,
    metricId: Long,
    firstSeenTime: LocalDateTime,
    lastSeenTime: LocalDateTime
): MetricInfoDimensionInsertValuesStep<in R> = values(
    organizationId,
    metricId,
    firstSeenTime,
    lastSeenTime
)

typealias MetricInfoDimensionInsertValuesStep<R> = InsertValuesStep4<R, UUID, Long, LocalDateTime, LocalDateTime>
