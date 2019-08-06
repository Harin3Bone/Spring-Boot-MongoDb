package th.co.practice.Library;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Thanks {
    @GetMapping("/thanks")
    public String index(){
        return "Thank you";
    }
}
