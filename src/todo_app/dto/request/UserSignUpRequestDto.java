package todo_app.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserSignUpRequestDto {
    private String userId;
    private String password;
    private String passwordCheck; // 비밀번호 확인
    private String username;
    private String nickname;
    private String email;
    private String phone;


}
