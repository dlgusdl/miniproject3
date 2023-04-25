package shop.metacoding.miniproject3.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import shop.metacoding.miniproject3.model.user.User;

@Getter
@Setter
@Builder
public class JoinReqDto {
    private String username;
    private String password;
    private String email;

    public JoinReqDto toEntity() {
        return User.builder()
                .username(this.username)
                .password(this.password)
                .email(this.email)
                .build();
    }
}
