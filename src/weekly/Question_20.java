package weekly;

import java.util.Collections;
import java.util.stream.Collectors;

// Question 20: Reverse a string using streams
public class Question_20 {
    public static void main(String[] args){
        String input = "hello";
        String res = input.chars()
                .mapToObj(c->String.valueOf((char)c))
                .collect(Collectors.collectingAndThen(Collectors.toList(),list -> {
                    Collections.reverse(list);
                    return String.join("", list);
                }));
        System.out.println(res);
    }
}
