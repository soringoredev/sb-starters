package pixel.academy.sb_starters;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExempluRestController {

    @GetMapping("/test")
    public String exemplu() {
        return "Acesta este un exemplu";
    }

}
