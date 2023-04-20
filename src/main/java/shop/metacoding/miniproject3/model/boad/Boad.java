package shop.metacoding.miniproject3.model.boad;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Boad {
    private Integer boadId;
    private String password;
    private String title;
    private String content;
    private Timestamp createdAt;
}
