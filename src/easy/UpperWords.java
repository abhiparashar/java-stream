package easy;

import java.util.Arrays;
import java.util.List;

public class UpperWords {
    public static void main(String [] args){
        List<String> words = Arrays.asList("hello", "world", "java", "streams");
        List<String> upperCaseWords = words.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(upperCaseWords);
    }
}
