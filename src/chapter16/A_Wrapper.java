package chapter16;

import com.sun.jdi.IntegerValue;

public class A_Wrapper {
    public static void main(String[] args) {
        int i = 5;
        Integer integerobj = i;
        System.out.println(integerobj);//결과 : 5

        Integer integerValue = Integer.valueOf(15);
        int iVal = integerValue;
        System.out.println(iVal);

        new Integer(50);

        int myInt = integerValue.intValue();
        System.out.println(myInt);

        int parseInt = Integer.parseInt("123");
        System.out.println(parseInt);

//        Integer anotherInt = new Integer(51);
//        int result = myInt.compareTo(anotherInt);
//        System.out.println(result); // -1






    }
}
