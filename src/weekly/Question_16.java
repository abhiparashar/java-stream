package weekly;

import java.util.Arrays;
import java.util.List;

//Question 16: Print all elements using method reference
public class Question_16 {
    public static void main(String[] args){
        List<String> words = Arrays.asList("hello", "world", "java");
        words.forEach(System.out::println);
    }
}
