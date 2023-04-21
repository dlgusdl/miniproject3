package shop.metacoding.miniproject3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import shop.metacoding.miniproject3.model.boad.BoadRepository;
import shop.metacoding.miniproject3.model.product.Product;
import shop.metacoding.miniproject3.model.user.UserRepository;

@Controller
public class ProductController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BoadRepository boadRepository;

    @GetMapping("/loginForm")
    public String login() {
        return "loginForm";
    }

    @GetMapping("/homeForm")
    public String home() {
        return "homeForm";
    }

    @GetMapping("/productForm")
    public String product() {
        return "productForm";
    }

    // 상품 수정하기
    // @PostMapping("/product/{userId}")
    public void update(Product product) {
        //
    }

    // 상품 삭제하기
    // @PostMapping("/product/{userId}")
    public void dalete(@PathVariable Integer product) {
        //
    }

}
