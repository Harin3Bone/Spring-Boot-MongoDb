package th.co.practice.Library.define;

public enum BookCategory {
    Novel ("A"),
    Comic ("B"),
    Magazine ("C"),
    News ("D");

    private String bookAlphabet;

    private BookCategory(String bookAlphabet){
        this.bookAlphabet = bookAlphabet;
    }

    public String getBookAlphabet() {
        return bookAlphabet;
    }

    public void setBookAlphabet(String bookAlphabet) {
        this.bookAlphabet = bookAlphabet;
    }
}
