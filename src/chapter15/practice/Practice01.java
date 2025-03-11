package chapter15.practice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;

@ToString
@Getter
@AllArgsConstructor
class Order {
    private String item;
    private int quantity;
}


public class Practice01{
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("tab",5), new Order("hand",6),new Order("call", 8)

        );



    }
}