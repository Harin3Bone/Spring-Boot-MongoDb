package th.co.practice.Library.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import th.co.practice.Library.document.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {
}
