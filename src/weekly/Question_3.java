package weekly;

import java.util.Arrays;
import java.util.List;

//Convert strings to their lengths
public class Question_3 {
    public static void main(String[] args){
        List<String> words = Arrays.asList("hello", "world", "java", "streams");
        List<Integer>count = words.stream()
                .map(String::length)
                .toList();
        System.out.println(count);
    }
}
