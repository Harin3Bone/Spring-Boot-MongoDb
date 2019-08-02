package th.co.practice.Library.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ThankYou {
    @RequestMapping("thanks")
    public String thanks(){
        return "Thank you";
    }
}
