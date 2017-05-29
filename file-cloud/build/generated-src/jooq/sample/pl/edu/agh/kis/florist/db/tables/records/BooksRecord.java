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

import pl.edu.agh.kis.florist.db.tables.Books;


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
public class BooksRecord extends UpdatableRecordImpl<BooksRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = -745806145;

    /**
     * Setter for <code>books.id</code>.
     */
    public BooksRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>books.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>books.name</code>.
     */
    public BooksRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>books.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>books.isbn</code>.
     */
    public BooksRecord setIsbn(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>books.isbn</code>.
     */
    public String getIsbn() {
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
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Books.BOOKS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Books.BOOKS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Books.BOOKS.ISBN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getIsbn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BooksRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BooksRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BooksRecord value3(String value) {
        setIsbn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BooksRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BooksRecord
     */
    public BooksRecord() {
        super(Books.BOOKS);
    }

    /**
     * Create a detached, initialised BooksRecord
     */
    public BooksRecord(Integer id, String name, String isbn) {
        super(Books.BOOKS);

        set(0, id);
        set(1, name);
        set(2, isbn);
    }
}