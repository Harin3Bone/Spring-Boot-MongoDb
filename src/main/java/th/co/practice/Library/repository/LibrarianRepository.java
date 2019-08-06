package th.co.practice.Library.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import th.co.practice.Library.document.Librarian;

public interface LibrarianRepository extends MongoRepository<Librarian, Integer> {

}
