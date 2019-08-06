package th.co.practice.Library.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import th.co.practice.Library.document.Book;
import th.co.practice.Library.repository.BookRepository;

import java.util.List;

@RestController
@RequestMapping("/res/book")
public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @GetMapping("/all")
    public List<Book> bookAll(){
        return bookRepository.findAll();
    }
}
