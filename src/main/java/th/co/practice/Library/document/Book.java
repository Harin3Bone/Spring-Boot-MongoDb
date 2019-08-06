package th.co.practice.Library.document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import th.co.practice.Library.specific.BookCategory;
import th.co.practice.Library.specific.BookStatus;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
@Setter
public class Book {
    @Id
    private UUID uuid;

    @NotNull
    private String bookName;

    @NotNull
    private BookCategory bookCategory;

    @NotNull
    private String bookCode;

    @NotNull
    private String bookAuthor;

    @NotNull
    private BookStatus bookStatus;

    public Book(){

    }

    public Book(UUID uuid, String bookName, BookCategory bookCategory, String bookCode, String bookAuthor, BookStatus bookStatus) {
        this.uuid = uuid;
        this.bookName = bookName;
        this.bookCategory = bookCategory;
        this.bookCode = bookCode;
        this.bookAuthor = bookAuthor;
        this.bookStatus = bookStatus;
    }
}
