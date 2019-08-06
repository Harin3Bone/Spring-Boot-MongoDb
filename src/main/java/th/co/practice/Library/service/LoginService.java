package th.co.practice.Library.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/login")
public class LoginService {
    @GetMapping("/")
    public void loginLibraCheck(){
    }
}
