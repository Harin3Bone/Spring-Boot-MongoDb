package th.co.practice.Library.object.element;

import th.co.practice.Library.object.define.BookCategory;
import th.co.practice.Library.object.define.BookStatus;

import java.util.UUID;

public class Book {
    private UUID uuid = UUID.randomUUID();
    private String bookName;
    private String bookCode;
    private BookCategory bookCategory;
    private String bookAuthor;
    private String bookAbstract;
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

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookAbstract() {
        return bookAbstract;
    }

    public void setBookAbstract(String bookAbstract) {
        this.bookAbstract = bookAbstract;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }

    public Book(){

    }

    public Book(UUID uuid, String bookName, String bookCode, BookCategory bookCategory, String bookAuthor,
                String bookAbstract, BookStatus bookStatus) {
        this.uuid = uuid;
        this.bookName = bookName;
        this.bookCode = bookCode;
        this.bookCategory = bookCategory;
        this.bookAuthor = bookAuthor;
        this.bookAbstract = bookAbstract;
        this.bookStatus = bookStatus;
    }
}
