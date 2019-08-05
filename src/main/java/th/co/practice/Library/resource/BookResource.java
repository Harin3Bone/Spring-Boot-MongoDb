package th.co.practice.Library.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import th.co.practice.Library.document.BookS;
import th.co.practice.Library.repository.BookRepository;

import java.util.List;

@RestController
@RequestMapping("/res/book")
public class BookResource {
    private BookRepository bookRepository;

    public BookResource(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @GetMapping("/all")
    public List<BookS> getAll(){
        return bookRepository.findAll();
    }
}
