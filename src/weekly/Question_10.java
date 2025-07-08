package weekly;

import java.util.Arrays;
import java.util.List;

// Question 10: Find first word starting with 'b'
public class Question_10 {
    public static void main(String[] args){
        List<String> words = Arrays.asList("apple", "banana", "cherry", "blueberry");
        String word = words.stream()
                .filter(elem->elem.startsWith("b"))
                .findFirst().orElse("Not Found");
        System.out.println(word);
    }
}
