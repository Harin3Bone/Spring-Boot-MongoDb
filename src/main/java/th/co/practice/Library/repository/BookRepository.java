package th.co.practice.Library.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import th.co.practice.Library.document.BookS;

public interface BookRepository extends MongoRepository<BookS, Integer> {
}
