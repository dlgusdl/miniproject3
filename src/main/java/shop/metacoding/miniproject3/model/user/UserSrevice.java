package shop.metacoding.miniproject3.model.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.metacoding.miniproject3.dto.JoinReqDto;

@Service
public class UserSrevice {
    @Autowired
    private UserRepository userRepository;

    public void 회원가입(JoinReqDto joinReqDto) {
        int result = userRepository.insert(joinReqDto.toEntity());
    }
}
