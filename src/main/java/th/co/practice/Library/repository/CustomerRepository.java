package th.co.practice.Library.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import th.co.practice.Library.document.Customer;

public interface CustomerRepository extends MongoRepository<Customer,Integer> {

}
