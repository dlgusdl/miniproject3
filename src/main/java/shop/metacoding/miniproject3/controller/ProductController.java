package shop.metacoding.miniproject3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    // @GetMapping("/join")
    // public String join() {
    // return "join";
    // }

    @GetMapping("/home")
    public String home() {
        return "home";
    }
}
