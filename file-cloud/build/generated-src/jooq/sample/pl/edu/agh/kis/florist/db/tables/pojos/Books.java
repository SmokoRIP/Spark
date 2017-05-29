/**
 * This class is generated by jOOQ
 */
package pl.edu.agh.kis.florist.db.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class Books implements Serializable {

    private static final long serialVersionUID = -1162854258;

    private final Integer id;
    private final String  name;
    private final String  isbn;

    public Books(Books value) {
        this.id = value.id;
        this.name = value.name;
        this.isbn = value.isbn;
    }

    public Books(
        Integer id,
        String  name,
        String  isbn
    ) {
        this.id = id;
        this.name = name;
        this.isbn = isbn;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getIsbn() {
        return this.isbn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Books (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(isbn);

        sb.append(")");
        return sb.toString();
    }
}
