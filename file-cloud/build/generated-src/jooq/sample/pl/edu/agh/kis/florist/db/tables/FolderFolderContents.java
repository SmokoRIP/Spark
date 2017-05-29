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
import pl.edu.agh.kis.florist.db.tables.records.FolderFolderContentsRecord;


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
public class FolderFolderContents extends TableImpl<FolderFolderContentsRecord> {

    private static final long serialVersionUID = 50145032;

    /**
     * The reference instance of <code>folder_folder_contents</code>
     */
    public static final FolderFolderContents FOLDER_FOLDER_CONTENTS = new FolderFolderContents();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FolderFolderContentsRecord> getRecordType() {
        return FolderFolderContentsRecord.class;
    }

    /**
     * The column <code>folder_folder_contents.parent_folder_id</code>.
     */
    public final TableField<FolderFolderContentsRecord, Integer> PARENT_FOLDER_ID = createField("parent_folder_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>folder_folder_contents.contained_folder_id</code>.
     */
    public final TableField<FolderFolderContentsRecord, Integer> CONTAINED_FOLDER_ID = createField("contained_folder_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>folder_folder_contents</code> table reference
     */
    public FolderFolderContents() {
        this("folder_folder_contents", null);
    }

    /**
     * Create an aliased <code>folder_folder_contents</code> table reference
     */
    public FolderFolderContents(String alias) {
        this(alias, FOLDER_FOLDER_CONTENTS);
    }

    private FolderFolderContents(String alias, Table<FolderFolderContentsRecord> aliased) {
        this(alias, aliased, null);
    }

    private FolderFolderContents(String alias, Table<FolderFolderContentsRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<FolderFolderContentsRecord> getPrimaryKey() {
        return Keys.PK_FOLDER_FOLDER_CONTENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FolderFolderContentsRecord>> getKeys() {
        return Arrays.<UniqueKey<FolderFolderContentsRecord>>asList(Keys.PK_FOLDER_FOLDER_CONTENTS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<FolderFolderContentsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<FolderFolderContentsRecord, ?>>asList(Keys.FK_FOLDER_FOLDER_CONTENTS_FOLDER_METADATA_2, Keys.FK_FOLDER_FOLDER_CONTENTS_FOLDER_METADATA_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FolderFolderContents as(String alias) {
        return new FolderFolderContents(alias, this);
    }

    /**
     * Rename this table
     */
    public FolderFolderContents rename(String name) {
        return new FolderFolderContents(name, null);
    }
}