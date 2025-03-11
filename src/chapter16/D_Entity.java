package chapter16;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

class UserSignInRequestDto{
    private String userId;
    private String password;
}

@AllArgsConstructor
@Getter
class Address{
    private final String city;
    private final String zipcode;

}

class UserSignInResponseDto{
    private String userId;
    private String nickName;

    public UserSignInResponseDto(String id, String nickname) {
    }
}

class UserDao{
    public UserSignInResponseDto getUserById(String userId){
        String id = "kong9411";
        String nickname = "bergerac";

        return new UserSignInResponseDto(id,nickname);
    }

}

class User{
    private Long id;
    private String userID;
    private String password;
    private String name;
    private String email;
    private Date signUpDate;
}


public class D_Entity {
    public static void main(String[] args) {

    }
}
