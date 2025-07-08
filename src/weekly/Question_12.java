package weekly;

import java.util.Arrays;
import java.util.List;

// Question 12: Check if any word has more than 6 characters
public class Question_12 {
    public static void main(String[] args){
        List<String> words = Arrays.asList("cat", "elephant", "dog");
        String str = words.stream()
                .filter(elem->elem.length()>6)
                .findAny().orElse("Not Found");
        System.out.println(str);
    }
}
