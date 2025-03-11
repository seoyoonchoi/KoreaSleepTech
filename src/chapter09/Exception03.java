package chapter09;
class InvalidUserException extends Exception{
    InvalidUserException(String message){
        super(message);//Exception class의 get Message 사용
    }
}

class CustomException extends Exception{
    CustomException(String message){
        super(message);
    }
}
/*
문자열.equals(문자열)
동일한 문자열일 경우 true, 그렇지 않으면 false 로 반환
 */

public class Exception03 {
    static void login(String username, String password)throws InvalidUserException {
        //throws는 예외를 반드시 처리하도록 이름을 붙여주는 역할이 throws InvalidUserException
        if(!"admin".equals(username)){
            throw new InvalidUserException("사용자 이름이 잘못되었습니다.");
        }
    }

    static void exceptions(int num) throws CustomException, ArithmeticException, ArrayIndexOutOfBoundsException{
        if (num == 1) {
            throw new CustomException("1번 선택 커스텀 예외");
        }else if(num==2){
            throw new ArithmeticException("2번선택 - 수학공식예외");
        }else new ArrayIndexOutOfBoundsException("그 외에는 배열 인덱스 초과 예외");
    }

    public static void main(String[] args) {
        int age = -10;

        try {
            if (age < 0) {
                throw new Exception("나이는 음수가 될 수 없습니다!!!");
            }
            System.out.println("출력 X");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }



        try{
            login("admin","password");
        }catch(InvalidUserException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("여러 예외 던지기 실습");
            exceptions(1);
        }catch(CustomException e){
            System.out.println("1번 "+e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("2번 "+e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("기타" +e.getMessage());
        }


    }
}
