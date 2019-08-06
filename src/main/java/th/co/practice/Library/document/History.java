package th.co.practice.Library.document;

import org.springframework.data.annotation.Id;
import th.co.practice.Library.specific.BookCategory;
import th.co.practice.Library.specific.BookSituation;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;

public class History {
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
    private BookSituation bookSituation;

    @NotNull
    private String librarianName;

    @NotNull
    private String customerName;

    private LocalDate borrowDate;
    private LocalDate returnDate;

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

    public BookSituation getBookSituation() {
        return bookSituation;
    }

    public void setBookSituation(BookSituation bookSituation) {
        this.bookSituation = bookSituation;
    }

    public String getLibrarianName() {
        return librarianName;
    }

    public void setLibrarianName(String librarianName) {
        this.librarianName = librarianName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public History(UUID uuid, String bookName, BookCategory bookCategory, String bookCode, String bookAuthor,
                   BookSituation bookSituation, String librarianName, String customerName,
                   LocalDate borrowDate, LocalDate returnDate) {
        this.uuid = uuid;
        this.bookName = bookName;
        this.bookCategory = bookCategory;
        this.bookCode = bookCode;
        this.bookAuthor = bookAuthor;
        this.bookSituation = bookSituation;
        this.librarianName = librarianName;
        this.customerName = customerName;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }
}
