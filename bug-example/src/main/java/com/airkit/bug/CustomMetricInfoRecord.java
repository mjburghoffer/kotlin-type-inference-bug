package com.airkit.bug;

import org.eclipse.jdt.annotation.NonNull;
import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;

import java.time.LocalDateTime;
import java.util.UUID;

@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class CustomMetricInfoRecord extends TableRecordImpl<CustomMetricInfoRecord> implements MetricInfoDimensionRecord<CustomMetricInfoRecord>, Record4<Long, UUID, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = -1445729140;

    public void setReportingMetricId(Long value) {
        set(0, value);
    }

    public Long getReportingMetricId() {
        return (Long) get(0);
    }

    public void setOrganizationId(UUID value) {
        set(1, value);
    }

    public UUID getOrganizationId() {
        return (UUID) get(1);
    }

    public void setFirstSeenTime(LocalDateTime value) {
        set(5, value);
    }

    public LocalDateTime getFirstSeenTime() {
        return (LocalDateTime) get(5);
    }

    public void setLastSeenTime(LocalDateTime value) {
        set(6, value);
    }

    public LocalDateTime getLastSeenTime() {
        return (LocalDateTime) get(6);
    }

    @Override
    public Row4<Long, UUID, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, UUID, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return CustomMetricInfoTable.CUSTOM_METRIC_INFO.REPORTING_METRIC_ID;
    }

    @Override
    public Field<UUID> field2() {
        return CustomMetricInfoTable.CUSTOM_METRIC_INFO.ORGANIZATION_ID;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return CustomMetricInfoTable.CUSTOM_METRIC_INFO.FIRST_SEEN_TIME;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return CustomMetricInfoTable.CUSTOM_METRIC_INFO.LAST_SEEN_TIME;
    }

    @Override
    public Long component1() {
        return getReportingMetricId();
    }

    @Override
    public UUID component2() {
        return getOrganizationId();
    }

    @Override
    public LocalDateTime component3() {
        return getFirstSeenTime();
    }

    @Override
    public LocalDateTime component4() {
        return getLastSeenTime();
    }

    @Override
    public Long value1() {
        return getReportingMetricId();
    }

    @Override
    public UUID value2() {
        return getOrganizationId();
    }

    @Override
    public LocalDateTime value3() {
        return getFirstSeenTime();
    }

    @Override
    public LocalDateTime value4() {
        return getLastSeenTime();
    }

    @Override
    public CustomMetricInfoRecord value1(Long value) {
        setReportingMetricId(value);
        return this;
    }

    @Override
    public CustomMetricInfoRecord value2(UUID value) {
        setOrganizationId(value);
        return this;
    }

    @Override
    public CustomMetricInfoRecord value3(LocalDateTime value) {
        setFirstSeenTime(value);
        return this;
    }

    @Override
    public CustomMetricInfoRecord value4(LocalDateTime value) {
        setLastSeenTime(value);
        return this;
    }

    @Override
    public CustomMetricInfoRecord values(Long value1, UUID value2, LocalDateTime value3, LocalDateTime value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    public CustomMetricInfoRecord() {
        super(CustomMetricInfoTable.CUSTOM_METRIC_INFO);
    }

    public CustomMetricInfoRecord(Long reportingMetricId, UUID organizationId, UUID deployId, UUID appId, UUID branchId, LocalDateTime firstSeenTime, LocalDateTime lastSeenTime, LocalDateTime countFirstSeenTime, LocalDateTime countLastSeenTime, LocalDateTime statisticFirstSeenTime, LocalDateTime statisticLastSeenTime, LocalDateTime fieldFirstSeenTime, LocalDateTime fieldLastSeenTime) {
        super(CustomMetricInfoTable.CUSTOM_METRIC_INFO);

        set(0, reportingMetricId);
        set(1, organizationId);
        set(2, firstSeenTime);
        set(3, lastSeenTime);
    }

    @NonNull
    @Override
    public Long getMetricId() {
        return getReportingMetricId();
    }
}
