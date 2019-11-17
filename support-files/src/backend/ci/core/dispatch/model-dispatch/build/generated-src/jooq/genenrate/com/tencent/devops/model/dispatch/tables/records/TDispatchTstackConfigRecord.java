/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.dispatch.tables.records;


import com.tencent.devops.model.dispatch.tables.TDispatchTstackConfig;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TDispatchTstackConfigRecord extends UpdatableRecordImpl<TDispatchTstackConfigRecord> implements Record2<String, Boolean> {

    private static final long serialVersionUID = 594244744;

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_TSTACK_CONFIG.PROJECT_ID</code>.
     */
    public TDispatchTstackConfigRecord setProjectId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_TSTACK_CONFIG.PROJECT_ID</code>.
     */
    public String getProjectId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_TSTACK_CONFIG.TSTACK_ENABLE</code>.
     */
    public TDispatchTstackConfigRecord setTstackEnable(Boolean value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_TSTACK_CONFIG.TSTACK_ENABLE</code>.
     */
    public Boolean getTstackEnable() {
        return (Boolean) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, Boolean> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, Boolean> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TDispatchTstackConfig.T_DISPATCH_TSTACK_CONFIG.PROJECT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field2() {
        return TDispatchTstackConfig.T_DISPATCH_TSTACK_CONFIG.TSTACK_ENABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getProjectId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value2() {
        return getTstackEnable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchTstackConfigRecord value1(String value) {
        setProjectId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchTstackConfigRecord value2(Boolean value) {
        setTstackEnable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchTstackConfigRecord values(String value1, Boolean value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TDispatchTstackConfigRecord
     */
    public TDispatchTstackConfigRecord() {
        super(TDispatchTstackConfig.T_DISPATCH_TSTACK_CONFIG);
    }

    /**
     * Create a detached, initialised TDispatchTstackConfigRecord
     */
    public TDispatchTstackConfigRecord(String projectId, Boolean tstackEnable) {
        super(TDispatchTstackConfig.T_DISPATCH_TSTACK_CONFIG);

        set(0, projectId);
        set(1, tstackEnable);
    }
}