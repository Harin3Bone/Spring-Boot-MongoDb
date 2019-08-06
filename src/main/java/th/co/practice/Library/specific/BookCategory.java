package th.co.practice.Library.specific;

public enum BookCategory {
    Comic ("A"),
    Novel ("B"),
    Magazine ("C"),
    News ("D");

    String bookCode;

    private BookCategory(String bookCode){
        this.bookCode = bookCode;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }
}
