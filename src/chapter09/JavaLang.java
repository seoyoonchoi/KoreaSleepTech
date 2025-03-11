package chapter09;

//java.lang package

class MyClass extends Object{
    private int id;
    private String name;

    MyClass(int id,String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Myclass( ID: "+id+"name: "+name+")";
    }

    String displayInfo(){
        return " ID: "+id+"name: "+name;
    }
}

public class JavaLang {
    public static void main(String[] args) {
        System.out.println("Object class");
        MyClass myClass1 = new MyClass(1, "lee");
        System.out.println((myClass1));
        System.out.println(myClass1.toString());
        System.out.println(myClass1.displayInfo());


        MyClass myClass2 = new MyClass(2,"Do");
        System.out.println((myClass1.equals(myClass2)));

        MyClass myClass3= myClass1;
        System.out.println(myClass1.equals(myClass3));

        MyClass myClass4 = new MyClass(2,"Do");
        System.out.println(myClass4.equals(myClass2));
        System.out.println("---------------------");

        String s1 = "Bergerac";
        String s2 = "Bergerac";
        System.out.println(s1.equals(s2));//true

        System.out.println("--------MATH-----------");
        System.out.println(Math.abs(-10));//절대값
        System.out.println(Math.max(10,20));//큰수
        System.out.println(Math.min(10,20));//작은수
        System.out.println(Math.sqrt(16));//제곱근
        System.out.println(Math.sqrt(25));
        System.out.println(Math.pow(2,3));//a^b반환
        System.out.println(Math.random());//0.0이상 0.1 미만의 난수를 생성한다.

        System.out.println("----------------String ------------");
        String message  = "Merry Christmas!";


        System.out.println(message.length());
        //문자 뿐 아니라 공백이나 기호까지 포함해서 길이를 계산한다.

        boolean isEquals = message.equals("Merry Christmas^^");
        System.out.println(isEquals);//false

        System.out.println(message.substring(6,15));//Christmas
        System.out.println(message);

        //----------------------------indexof
        int index = message.indexOf("Christmas");
        System.out.println(index);//6

        //charAt (int index)
        //String으로 저장된 문자열 중에서 한 글자만 선택해서 char type로 변환시켜줌

        char c = message.charAt(6);
        System.out.println(c);





    }
}
