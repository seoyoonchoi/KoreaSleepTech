package chapter05;

//클래스 : 필드 +메서드 +생성자
//함수 vs 메서드
//자바는 메서드만 쓴다(특정 작업을 하나로 묶은 것)

class Example{
    int x,y;//(인스턴스)필드
    int add(int x,int y){//파라미터(매개변수)-지역변수
        int result = x+y;
        return result;//지역변수
    }

    double multiply(){
        int result = x*y;
        return result;
    }

    void print99dan(){
        //메서드명은 변수명의 명명규칙과 동일하다
        for(int i = 1;i<8;i++){
            for(int j = 0; j<8;j++){
                System.out.println(j*i+" ");
            }
            System.out.println();
        }
    }




}

public class B_Method {
    public static void main(String[] args) {
        Example example = new Example();
        example.print99dan();
        //함수의 파라미터에 데이터 전달
        //: 함수 호출 시 () 영역 내에서 parameter(매개변수)에 전달되는 값을 argument라 부른다.

    }
}
