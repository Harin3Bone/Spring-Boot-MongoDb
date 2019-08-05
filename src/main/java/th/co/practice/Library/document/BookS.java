package th.co.practice.Library.document;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class BookS {
    private Integer id;
    private String name;
    private String author;
    private Long code;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public BookS(){

    }

    public BookS(Integer id, String name, String author, Long code) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.code = code;
    }
}
