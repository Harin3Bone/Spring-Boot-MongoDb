package th.co.practice.Library.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import th.co.practice.Library.document.Librarian;
import th.co.practice.Library.repository.LibrarianRepository;

import java.util.List;

@RestController
@RequestMapping("/res/librarian")
public class LibrarianResource {
    private LibrarianRepository librarianRepository;

    public LibrarianResource(LibrarianRepository librarianRepository){
        this.librarianRepository = librarianRepository;
    }

    @GetMapping("/all")
    public List<Librarian> libraAll(){
        return librarianRepository.findAll();
    }
}
