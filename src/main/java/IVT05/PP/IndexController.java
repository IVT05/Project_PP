package IVT05.PP;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/Index")
    public String index() {
        Index index1 = new Index("src\\main\\java\\IVT05\\PP\\Index.html");
        return index1.getHtml();
    }

}