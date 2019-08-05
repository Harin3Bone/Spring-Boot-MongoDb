package th.co.practice.Library;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

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

}
