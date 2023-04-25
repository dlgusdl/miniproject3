package shop.metacoding.miniproject3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import shop.metacoding.miniproject3.dto.JoinReqDto;
import shop.metacoding.miniproject3.dto.LoginReqDto;
import shop.metacoding.miniproject3.model.boad.BoadRepository;
import shop.metacoding.miniproject3.model.product.Product;
import shop.metacoding.miniproject3.model.user.UserRepository;

@Controller
public class ProductController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BoadRepository boadRepository;

    @GetMapping("/login")
    public String login(LoginReqDto loginReqDto) {
        if (loginReqDto.getUsername() == null || loginReqDto.getUsername().isEmpty()) {
            throw new CustomException("username을 입력해주세요", HttpStatus.BAD_REQUEST);
        }
        if (loginReqDto.getPasswrod() == null || loginReqDto.getPasswrod().isEmpty()) {
            throw new CustomException("password을 입력해주세요", HttpStatus.BAD_REQUEST);
        }
        return "redirect:/loginForm";
    }

    @GetMapping("/joinForm")
    public String home(JoinReqDto joinReqDto) {
        if (joinReqDto.getUsername() == null || joinReqDto.getUsername().isEmpty()) {
            throw new CustomException("username을 입력해주세요", HttpStatus.BAD_REQUEST);
        }
        if (joinReqDto.getPasswrod() == null || joinReqDto.getPasswrod().isEmpty()) {
            throw new CustomException("password을 입력해주세요", HttpStatus.BAD_REQUEST);
        }
        if (joinReqDto.getEmail() == null || joinReqDto.getEmail().isEmpty()) {
            throw new CustomException("email을 입력해주세요", HttpStatus.BAD_REQUEST);
        }
        return "redirect:/joinForm";
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
