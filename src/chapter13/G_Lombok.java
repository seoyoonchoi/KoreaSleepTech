package chapter13;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

class LombokExample{
    private String name;
    private int age;



}

public class G_Lombok {
    public static void main(String[] args) {
        LombokExample lombokExample = new LombokExample();
        lombokExample.setName("bergerac");
        lombokExample.setAge(34);

        System.out.println(lombokExample.getName());
        System.out.println(lombokExample.getAge());

    }
}


