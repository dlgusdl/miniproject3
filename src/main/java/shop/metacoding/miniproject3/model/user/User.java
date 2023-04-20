package shop.metacoding.miniproject3.model.user;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    private Integer userId;
    private String passwrod;
    private String username;
    private String email;
    private Timestamp createdAt;
}
