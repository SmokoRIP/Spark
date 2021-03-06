/**
 * This class is generated by jOOQ
 */
package pl.edu.agh.kis.florist.db.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import pl.edu.agh.kis.florist.db.tables.SessionData;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SessionDataRecord extends UpdatableRecordImpl<SessionDataRecord> implements Record3<Object, Integer, String> {

    private static final long serialVersionUID = 1304824903;

    /**
     * Setter for <code>session_data.session_id</code>.
     */
    public SessionDataRecord setSessionId(Object value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>session_data.session_id</code>.
     */
    public Object getSessionId() {
        return (Object) get(0);
    }

    /**
     * Setter for <code>session_data.user_id</code>.
     */
    public SessionDataRecord setUserId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>session_data.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>session_data.last_accessed</code>.
     */
    public SessionDataRecord setLastAccessed(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>session_data.last_accessed</code>.
     */
    public String getLastAccessed() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Object, Integer, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Object, Integer, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Object> field1() {
        return SessionData.SESSION_DATA.SESSION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return SessionData.SESSION_DATA.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SessionData.SESSION_DATA.LAST_ACCESSED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object value1() {
        return getSessionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLastAccessed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SessionDataRecord value1(Object value) {
        setSessionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SessionDataRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SessionDataRecord value3(String value) {
        setLastAccessed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SessionDataRecord values(Object value1, Integer value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SessionDataRecord
     */
    public SessionDataRecord() {
        super(SessionData.SESSION_DATA);
    }

    /**
     * Create a detached, initialised SessionDataRecord
     */
    public SessionDataRecord(Object sessionId, Integer userId, String lastAccessed) {
        super(SessionData.SESSION_DATA);

        set(0, sessionId);
        set(1, userId);
        set(2, lastAccessed);
    }
}
