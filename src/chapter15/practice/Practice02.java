package chapter15.practice;

import java.awt.image.ImageProducer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Practice02 {
    public static void main(String[] args) {
        List<String> fileNames = Arrays.asList(
                "a.pdf","b,png","picture.ppt","kominam.jpg","e.png","f.jpg","g.png"
        );

        List<String> filteredfiles = fileNames.stream()
                .filter(nameOfFile -> nameOfFile.endsWith(".png")||nameOfFile.endsWith(".jpg"))
                .collect(Collectors.toList());

        System.out.println(filteredfiles);

    }
}
