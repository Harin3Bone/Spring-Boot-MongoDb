package th.co.practice.Library.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import th.co.practice.Library.document.Librarian;
import th.co.practice.Library.repository.LibrarianRepository;

import java.util.List;

@RestController
@RequestMapping("/res/librarian")
public class LibrarianService {
    private LibrarianRepository librarianRepository;

    public LibrarianService(LibrarianRepository librarianRepository){
        this.librarianRepository = librarianRepository;
    }

    @GetMapping("/all")
    public List<Librarian> libraAll(){
        return librarianRepository.findAll();
    }

}
