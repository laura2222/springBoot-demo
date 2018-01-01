package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SampleController {
    private static final String template = "Hello,%s!";

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value = "name",defaultValue = "my name is lauren")String name) {
        return String.format(template,name);
    }

}
