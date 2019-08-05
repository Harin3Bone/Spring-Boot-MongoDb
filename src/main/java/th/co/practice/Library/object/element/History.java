package th.co.practice.Library.object.element;

import th.co.practice.Library.object.define.BookCategory;
import th.co.practice.Library.object.define.BookSituation;

import java.time.LocalDate;
import java.util.UUID;

public class History {
    private UUID uuid = UUID.randomUUID();
    private String bookName;
    private String bookCode;
    private BookCategory bookCategory;
    private String bookAuthor;
    private String bookAbstract;
    private LocalDate bookBorrow;
    private LocalDate bookReturn;
    private String bookLibrarian;
    private String bookCustomer;
    private BookSituation bookSituation;

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

    public LocalDate getBookBorrow() {
        return bookBorrow;
    }

    public void setBookBorrow(LocalDate bookBorrow) {
        this.bookBorrow = bookBorrow;
    }

    public LocalDate getBookReturn() {
        return bookReturn;
    }

    public void setBookReturn(LocalDate bookReturn) {
        this.bookReturn = bookReturn;
    }

    public String getBookLibrarian() {
        return bookLibrarian;
    }

    public void setBookLibrarian(String bookLibrarian) {
        this.bookLibrarian = bookLibrarian;
    }

    public String getBookCustomer() {
        return bookCustomer;
    }

    public void setBookCustomer(String bookCustomer) {
        this.bookCustomer = bookCustomer;
    }

    public BookSituation getBookSituation() {
        return bookSituation;
    }

    public void setBookSituation(BookSituation bookSituation) {
        this.bookSituation = bookSituation;
    }

    public History(){

    }

    public History(UUID uuid, String bookName, String bookCode, BookCategory bookCategory, String bookAuthor,
                   String bookAbstract, LocalDate bookBorrow, LocalDate bookReturn,
                   String bookLibrarian, String bookCustomer, BookSituation bookSituation) {
        this.uuid = uuid;
        this.bookName = bookName;
        this.bookCode = bookCode;
        this.bookCategory = bookCategory;
        this.bookAuthor = bookAuthor;
        this.bookAbstract = bookAbstract;
        this.bookBorrow = bookBorrow;
        this.bookReturn = bookReturn;
        this.bookLibrarian = bookLibrarian;
        this.bookCustomer = bookCustomer;
        this.bookSituation = bookSituation;
    }
}
