package com.airkit.bug;

import org.eclipse.jdt.annotation.NonNull;
import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;

import java.time.LocalDateTime;
import java.util.UUID;

@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class DefaultMetricInfoRecord extends TableRecordImpl<DefaultMetricInfoRecord> implements MetricInfoDimensionRecord<DefaultMetricInfoRecord>, Record4<UUID, Long, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 196966840;

    public void setOrganizationId(UUID value) {
        set(0, value);
    }

    public UUID getOrganizationId() {
        return (UUID) get(0);
    }

    public void setDefaultMetricId(Long value) {
        set(1, value);
    }

    public Long getDefaultMetricId() {
        return (Long) get(1);
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
    public Row4<UUID, Long, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<UUID, Long, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return DefaultMetricInfoTable.DEFAULT_METRIC_INFO.ORGANIZATION_ID;
    }

    @Override
    public Field<Long> field2() {
        return DefaultMetricInfoTable.DEFAULT_METRIC_INFO.DEFAULT_METRIC_ID;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return DefaultMetricInfoTable.DEFAULT_METRIC_INFO.FIRST_SEEN_TIME;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return DefaultMetricInfoTable.DEFAULT_METRIC_INFO.LAST_SEEN_TIME;
    }

    @Override
    public UUID component1() {
        return getOrganizationId();
    }

    @Override
    public Long component2() {
        return getDefaultMetricId();
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
    public UUID value1() {
        return getOrganizationId();
    }

    @Override
    public Long value2() {
        return getDefaultMetricId();
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
    public DefaultMetricInfoRecord value1(UUID value) {
        setOrganizationId(value);
        return this;
    }

    @Override
    public DefaultMetricInfoRecord value2(Long value) {
        setDefaultMetricId(value);
        return this;
    }

    @Override
    public DefaultMetricInfoRecord value3(LocalDateTime value) {
        setFirstSeenTime(value);
        return this;
    }

    @Override
    public DefaultMetricInfoRecord value4(LocalDateTime value) {
        setLastSeenTime(value);
        return this;
    }

    @Override
    public DefaultMetricInfoRecord values(UUID value1, Long value2, LocalDateTime value3, LocalDateTime value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    public DefaultMetricInfoRecord() {
        super(DefaultMetricInfoTable.DEFAULT_METRIC_INFO);
    }

    public DefaultMetricInfoRecord(UUID organizationId, Long defaultMetricId, LocalDateTime firstSeenTime, LocalDateTime lastSeenTime) {
        super(DefaultMetricInfoTable.DEFAULT_METRIC_INFO);

        set(0, organizationId);
        set(1, defaultMetricId);
        set(3, firstSeenTime);
        set(4, lastSeenTime);
    }

    @NonNull
    @Override
    public Long getMetricId() {
        return getDefaultMetricId();
    }
}
