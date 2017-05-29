/**
 * This class is generated by jOOQ
 */
package pl.edu.agh.kis.florist.db;


import javax.annotation.Generated;

import pl.edu.agh.kis.florist.db.tables.AuthorBooks;
import pl.edu.agh.kis.florist.db.tables.Authors;
import pl.edu.agh.kis.florist.db.tables.Books;
import pl.edu.agh.kis.florist.db.tables.FileContents;
import pl.edu.agh.kis.florist.db.tables.FileMetadata;
import pl.edu.agh.kis.florist.db.tables.FolderFileContents;
import pl.edu.agh.kis.florist.db.tables.FolderFolderContents;
import pl.edu.agh.kis.florist.db.tables.FolderMetadata;
import pl.edu.agh.kis.florist.db.tables.SchemaVersion;
import pl.edu.agh.kis.florist.db.tables.SessionData;
import pl.edu.agh.kis.florist.db.tables.Users;


/**
 * Convenience access to all tables in 
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>author_books</code>.
     */
    public static final AuthorBooks AUTHOR_BOOKS = pl.edu.agh.kis.florist.db.tables.AuthorBooks.AUTHOR_BOOKS;

    /**
     * The table <code>authors</code>.
     */
    public static final Authors AUTHORS = pl.edu.agh.kis.florist.db.tables.Authors.AUTHORS;

    /**
     * The table <code>books</code>.
     */
    public static final Books BOOKS = pl.edu.agh.kis.florist.db.tables.Books.BOOKS;

    /**
     * The table <code>file_contents</code>.
     */
    public static final FileContents FILE_CONTENTS = pl.edu.agh.kis.florist.db.tables.FileContents.FILE_CONTENTS;

    /**
     * The table <code>file_metadata</code>.
     */
    public static final FileMetadata FILE_METADATA = pl.edu.agh.kis.florist.db.tables.FileMetadata.FILE_METADATA;

    /**
     * The table <code>folder_file_contents</code>.
     */
    public static final FolderFileContents FOLDER_FILE_CONTENTS = pl.edu.agh.kis.florist.db.tables.FolderFileContents.FOLDER_FILE_CONTENTS;

    /**
     * The table <code>folder_folder_contents</code>.
     */
    public static final FolderFolderContents FOLDER_FOLDER_CONTENTS = pl.edu.agh.kis.florist.db.tables.FolderFolderContents.FOLDER_FOLDER_CONTENTS;

    /**
     * The table <code>folder_metadata</code>.
     */
    public static final FolderMetadata FOLDER_METADATA = pl.edu.agh.kis.florist.db.tables.FolderMetadata.FOLDER_METADATA;

    /**
     * The table <code>schema_version</code>.
     */
    public static final SchemaVersion SCHEMA_VERSION = pl.edu.agh.kis.florist.db.tables.SchemaVersion.SCHEMA_VERSION;

    /**
     * The table <code>session_data</code>.
     */
    public static final SessionData SESSION_DATA = pl.edu.agh.kis.florist.db.tables.SessionData.SESSION_DATA;

    /**
     * The table <code>users</code>.
     */
    public static final Users USERS = pl.edu.agh.kis.florist.db.tables.Users.USERS;
}
