package th.co.practice.Library;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetStart {

    @GetMapping("/")
    public String index(){
        return "Hello World";
    }

    @GetMapping("/int")
    public int interger(){
        return 1;
    }

    @GetMapping("/double")
    public double doubles(){
        return 5.3d;
    }

    @GetMapping("/thanks")
    public String thanks(){
        return "Thank you";
    }

}
