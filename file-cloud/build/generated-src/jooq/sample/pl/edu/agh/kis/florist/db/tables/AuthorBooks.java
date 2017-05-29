/**
 * This class is generated by jOOQ
 */
package pl.edu.agh.kis.florist.db.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import pl.edu.agh.kis.florist.db.DefaultSchema;
import pl.edu.agh.kis.florist.db.Keys;
import pl.edu.agh.kis.florist.db.tables.records.AuthorBooksRecord;


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
public class AuthorBooks extends TableImpl<AuthorBooksRecord> {

    private static final long serialVersionUID = -241971294;

    /**
     * The reference instance of <code>author_books</code>
     */
    public static final AuthorBooks AUTHOR_BOOKS = new AuthorBooks();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuthorBooksRecord> getRecordType() {
        return AuthorBooksRecord.class;
    }

    /**
     * The column <code>author_books.author_id</code>.
     */
    public final TableField<AuthorBooksRecord, Integer> AUTHOR_ID = createField("author_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>author_books.book_id</code>.
     */
    public final TableField<AuthorBooksRecord, Integer> BOOK_ID = createField("book_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>author_books</code> table reference
     */
    public AuthorBooks() {
        this("author_books", null);
    }

    /**
     * Create an aliased <code>author_books</code> table reference
     */
    public AuthorBooks(String alias) {
        this(alias, AUTHOR_BOOKS);
    }

    private AuthorBooks(String alias, Table<AuthorBooksRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuthorBooks(String alias, Table<AuthorBooksRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AuthorBooksRecord> getPrimaryKey() {
        return Keys.PK_AUTHOR_BOOKS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AuthorBooksRecord>> getKeys() {
        return Arrays.<UniqueKey<AuthorBooksRecord>>asList(Keys.PK_AUTHOR_BOOKS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<AuthorBooksRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AuthorBooksRecord, ?>>asList(Keys.FK_AUTHOR_BOOKS_AUTHORS_1, Keys.FK_AUTHOR_BOOKS_BOOKS_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorBooks as(String alias) {
        return new AuthorBooks(alias, this);
    }

    /**
     * Rename this table
     */
    public AuthorBooks rename(String name) {
        return new AuthorBooks(name, null);
    }
}
