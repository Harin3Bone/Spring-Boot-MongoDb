package th.co.practice.Library.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import th.co.practice.Library.document.Book;
import th.co.practice.Library.document.Customer;
import th.co.practice.Library.document.Librarian;
import th.co.practice.Library.repository.BookRepository;
import th.co.practice.Library.repository.CustomerRepository;
import th.co.practice.Library.repository.LibrarianRepository;
import th.co.practice.Library.specific.BookCategory;
import th.co.practice.Library.specific.BookStatus;

import java.util.UUID;

@EnableMongoRepositories(basePackageClasses = BookRepository.class)
@Configuration
public class MongodbConfig {
    @Bean
    CommandLineRunner  bookRepositoryRunner (BookRepository bookRepository){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                bookRepository.save(new Book(UUID.randomUUID(),"Iron Man", BookCategory.Comic,"A0001","Stan Lee", BookStatus.Available));
                bookRepository.save(new Book(UUID.randomUUID(),"Captain America", BookCategory.Comic,"A0002","Stan Lee", BookStatus.Available));
                bookRepository.save(new Book(UUID.randomUUID(),"Thor", BookCategory.Novel,"B0001","Stan Lee", BookStatus.Available));
            }
        };
    }

    @Bean
    CommandLineRunner  librarianRepositoryRunner (LibrarianRepository librarianRepository){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                librarianRepository.save(new Librarian(UUID.randomUUID(),"Atago","Azura","1111","1111"));
                librarianRepository.save(new Librarian(UUID.randomUUID(),"Takao","Azura","2222","2222"));
                librarianRepository.save(new Librarian(UUID.randomUUID(),"Zchwazer","Zchwarzlanky","3333","3333"));
            }
        };
    }

    @Bean
    CommandLineRunner customerRepositoryRunner (CustomerRepository customerRepository){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                customerRepository.save(new Customer(UUID.randomUUID(),"Eli","Ayase","1","1"));
            }
        };
    }

}
