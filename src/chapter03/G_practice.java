package chapter03;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class G_practice {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("커피");
        items.add("볼펜");
        items.add("핸드폰");
        items.add("포스트잇");
        items.add("리모콘");

        Random random = new Random();
        //(random객체.nextInt(숫자값);
        //0부터 해당 숫자 미만의 정수가 생성된다.
        int index = random.nextInt(items.size());

        String selectedItem = items.get(index);

        Scanner sc = new Scanner(System.in);
        String userWord;

        while(true){
            System.out.println("아이템을 맞춰보세요");
            userWord = sc.nextLine();
            //A문자열.equals(B문자열)
            //일치의 결과값을 boolean으로 반환
            if(userWord.equals(selectedItem)){
                System.out.println("you're right");break;
            }else if(userWord.equals("종료")){
                break;
            }else{
                System.out.println("you're wrong Try one more time");
            }


        }
        sc.close();
        System.out.println("program quit");


    }
}
