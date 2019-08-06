package th.co.practice.Library.document;

import org.springframework.data.mongodb.core.mapping.Document;
import th.co.practice.Library.specific.BookCategory;
import th.co.practice.Library.specific.BookStatus;

import java.util.UUID;

@Document
public class Book {
    private UUID uuid;
    private String bookName;
    private BookCategory bookCategory;
    private String bookCode;
    private String bookAuthor;
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
