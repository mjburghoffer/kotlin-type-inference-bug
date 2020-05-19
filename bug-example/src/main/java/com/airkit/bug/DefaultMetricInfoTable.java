package com.airkit.bug;

import org.eclipse.jdt.annotation.NonNull;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import java.time.LocalDateTime;
import java.util.UUID;

@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class DefaultMetricInfoTable extends TableImpl<DefaultMetricInfoRecord> implements Table<DefaultMetricInfoRecord>, MetricInfoDimensionTable<DefaultMetricInfoRecord> {

    private static final long serialVersionUID = 2055310493;

    public static final DefaultMetricInfoTable DEFAULT_METRIC_INFO = new DefaultMetricInfoTable();

    @Override
    public Class<DefaultMetricInfoRecord> getRecordType() {
        return DefaultMetricInfoRecord.class;
    }

    public final TableField<DefaultMetricInfoRecord, UUID> ORGANIZATION_ID = createField(DSL.name("organization_id"), org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    public final TableField<DefaultMetricInfoRecord, Long> DEFAULT_METRIC_ID = createField(DSL.name("default_metric_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    public final TableField<DefaultMetricInfoRecord, LocalDateTime> FIRST_SEEN_TIME = createField(DSL.name("first_seen_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    public final TableField<DefaultMetricInfoRecord, LocalDateTime> LAST_SEEN_TIME = createField(DSL.name("last_seen_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    public DefaultMetricInfoTable() {
        this(DSL.name("default_metric_info"), null);
    }

    public DefaultMetricInfoTable(String alias) {
        this(DSL.name(alias), DEFAULT_METRIC_INFO);
    }

    public DefaultMetricInfoTable(Name alias) {
        this(alias, DEFAULT_METRIC_INFO);
    }

    private DefaultMetricInfoTable(Name alias, Table<DefaultMetricInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private DefaultMetricInfoTable(Name alias, Table<DefaultMetricInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Contains usage info on default metrics per app, deploy, and branch"), TableOptions.table());
    }

    public <O extends Record> DefaultMetricInfoTable(Table<O> child, ForeignKey<O, DefaultMetricInfoRecord> key) {
        super(child, key, DEFAULT_METRIC_INFO);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public DefaultMetricInfoTable as(String alias) {
        return new DefaultMetricInfoTable(DSL.name(alias), this);
    }

    @Override
    public DefaultMetricInfoTable as(Name alias) {
        return new DefaultMetricInfoTable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DefaultMetricInfoTable rename(String name) {
        return new DefaultMetricInfoTable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DefaultMetricInfoTable rename(Name name) {
        return new DefaultMetricInfoTable(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<UUID, Long, UUID, UUID, UUID, LocalDateTime, LocalDateTime, LocalDateTime, LocalDateTime, LocalDateTime, LocalDateTime, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @NonNull
    public TableField<@NonNull DefaultMetricInfoRecord, @NonNull UUID> getOrganizationId() {
        return ORGANIZATION_ID;
    }

    @NonNull
    public TableField<@NonNull DefaultMetricInfoRecord, @NonNull Long> getDefaultMetricId() {
        return DEFAULT_METRIC_ID;
    }

    @NonNull
    public TableField<@NonNull DefaultMetricInfoRecord, @NonNull LocalDateTime> getFirstSeenTime() {
        return FIRST_SEEN_TIME;
    }

    @NonNull
    public TableField<@NonNull DefaultMetricInfoRecord, @NonNull LocalDateTime> getLastSeenTime() {
        return LAST_SEEN_TIME;
    }

    @NonNull
    @Override
    public TableField<@NonNull DefaultMetricInfoRecord, @NonNull Long> getMetricId() {
        return DEFAULT_METRIC_ID;
    }

    protected DefaultMetricInfoTable(@NonNull Name name, boolean isAliased) {
        this(name, isAliased ? DEFAULT_METRIC_INFO : null);
    }
}
