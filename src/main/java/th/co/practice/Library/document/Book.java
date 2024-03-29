package th.co.practice.Library.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import th.co.practice.Library.specific.BookCategory;
import th.co.practice.Library.specific.BookStatus;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Document
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

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }

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
