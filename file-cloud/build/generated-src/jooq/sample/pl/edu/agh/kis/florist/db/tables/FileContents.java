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
import pl.edu.agh.kis.florist.db.tables.records.FileContentsRecord;


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
public class FileContents extends TableImpl<FileContentsRecord> {

    private static final long serialVersionUID = -1557560021;

    /**
     * The reference instance of <code>file_contents</code>
     */
    public static final FileContents FILE_CONTENTS = new FileContents();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FileContentsRecord> getRecordType() {
        return FileContentsRecord.class;
    }

    /**
     * The column <code>file_contents.file_id</code>.
     */
    public final TableField<FileContentsRecord, Integer> FILE_ID = createField("file_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>file_contents.contents</code>.
     */
    public final TableField<FileContentsRecord, byte[]> CONTENTS = createField("contents", org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * Create a <code>file_contents</code> table reference
     */
    public FileContents() {
        this("file_contents", null);
    }

    /**
     * Create an aliased <code>file_contents</code> table reference
     */
    public FileContents(String alias) {
        this(alias, FILE_CONTENTS);
    }

    private FileContents(String alias, Table<FileContentsRecord> aliased) {
        this(alias, aliased, null);
    }

    private FileContents(String alias, Table<FileContentsRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<FileContentsRecord> getPrimaryKey() {
        return Keys.PK_FILE_CONTENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FileContentsRecord>> getKeys() {
        return Arrays.<UniqueKey<FileContentsRecord>>asList(Keys.PK_FILE_CONTENTS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<FileContentsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<FileContentsRecord, ?>>asList(Keys.FK_FILE_CONTENTS_FILE_METADATA_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FileContents as(String alias) {
        return new FileContents(alias, this);
    }

    /**
     * Rename this table
     */
    public FileContents rename(String name) {
        return new FileContents(name, null);
    }
}
