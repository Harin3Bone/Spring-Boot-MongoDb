package th.co.practice.Library.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import th.co.practice.Library.document.Customer;
import th.co.practice.Library.repository.CustomerRepository;

import java.util.List;

@RestController
@RequestMapping("/res/customer")
public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @GetMapping("/all")
    public List<Customer> customerAll(){
        return customerRepository.findAll();
    }
}
