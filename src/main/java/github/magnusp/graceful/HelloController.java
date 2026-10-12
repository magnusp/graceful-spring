package github.magnusp.graceful;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(path = "/")
    public String index() throws InterruptedException {
        Thread.sleep(1000);
        return "Delayed greeting";
    }
}
