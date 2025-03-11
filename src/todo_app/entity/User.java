package todo_app.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Getter
@Builder
@AllArgsConstructor
public class User {
    private Long id;
    private String userId;
    private String username;
    private String nickname;
    private String password;
    private String email;
    private String phone;
    private Date registerDate;
}
