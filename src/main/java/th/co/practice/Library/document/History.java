package th.co.practice.Library.document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import th.co.practice.Library.specific.BookCategory;
import th.co.practice.Library.specific.BookSituation;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
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
