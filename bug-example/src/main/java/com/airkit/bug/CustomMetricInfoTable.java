package com.airkit.bug;

import org.eclipse.jdt.annotation.NonNull;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import java.time.LocalDateTime;
import java.util.UUID;

@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class CustomMetricInfoTable extends TableImpl<CustomMetricInfoRecord> implements Table<CustomMetricInfoRecord>, MetricInfoDimensionTable<CustomMetricInfoRecord> {

    private static final long serialVersionUID = 2032047929;

    public static final CustomMetricInfoTable CUSTOM_METRIC_INFO = new CustomMetricInfoTable();

    @Override
    public Class<CustomMetricInfoRecord> getRecordType() {
        return CustomMetricInfoRecord.class;
    }

    public final TableField<CustomMetricInfoRecord, Long> REPORTING_METRIC_ID = createField(DSL.name("reporting_metric_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<CustomMetricInfoRecord, UUID> ORGANIZATION_ID = createField(DSL.name("organization_id"), org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    public final TableField<CustomMetricInfoRecord, LocalDateTime> FIRST_SEEN_TIME = createField(DSL.name("first_seen_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    public final TableField<CustomMetricInfoRecord, LocalDateTime> LAST_SEEN_TIME = createField(DSL.name("last_seen_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    public CustomMetricInfoTable() {
        this(DSL.name("custom_metric_info"), null);
    }

    public CustomMetricInfoTable(String alias) {
        this(DSL.name(alias), CUSTOM_METRIC_INFO);
    }

    public CustomMetricInfoTable(Name alias) {
        this(alias, CUSTOM_METRIC_INFO);
    }

    private CustomMetricInfoTable(Name alias, Table<CustomMetricInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private CustomMetricInfoTable(Name alias, Table<CustomMetricInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Contains usage info on metrics per app, deploy, and branch"), TableOptions.table());
    }

    public <O extends Record> CustomMetricInfoTable(Table<O> child, ForeignKey<O, CustomMetricInfoRecord> key) {
        super(child, key, CUSTOM_METRIC_INFO);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public CustomMetricInfoTable as(String alias) {
        return new CustomMetricInfoTable(DSL.name(alias), this);
    }

    @Override
    public CustomMetricInfoTable as(Name alias) {
        return new CustomMetricInfoTable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomMetricInfoTable rename(String name) {
        return new CustomMetricInfoTable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomMetricInfoTable rename(Name name) {
        return new CustomMetricInfoTable(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<Long, UUID, UUID, UUID, UUID, LocalDateTime, LocalDateTime, LocalDateTime, LocalDateTime, LocalDateTime, LocalDateTime, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @NonNull
    public TableField<@NonNull CustomMetricInfoRecord, @NonNull Long> getReportingMetricId() {
        return REPORTING_METRIC_ID;
    }

    @NonNull
    public TableField<@NonNull CustomMetricInfoRecord, @NonNull UUID> getOrganizationId() {
        return ORGANIZATION_ID;
    }

    @NonNull
    public TableField<@NonNull CustomMetricInfoRecord, @NonNull LocalDateTime> getFirstSeenTime() {
        return FIRST_SEEN_TIME;
    }

    @NonNull
    public TableField<@NonNull CustomMetricInfoRecord, @NonNull LocalDateTime> getLastSeenTime() {
        return LAST_SEEN_TIME;
    }

    @NonNull
    @Override
    public TableField<@NonNull CustomMetricInfoRecord, @NonNull Long> getMetricId() {
        return REPORTING_METRIC_ID;
    }

    protected CustomMetricInfoTable(@NonNull Name name, boolean isAliased) {
        this(name, isAliased ? CUSTOM_METRIC_INFO : null);
    }
}
