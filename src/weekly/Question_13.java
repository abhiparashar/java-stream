package weekly;

import java.util.Arrays;
import java.util.List;

//Question 13: Count words longer than 4 characters
public class Question_13 {
    public static void main(String[] args){
        List<String> words = Arrays.asList("cat", "elephant", "dog", "hippopotamus");
        long count = words.stream()
                .filter(elem->elem.length()>4)
                .count();
        System.out.println(count);
    }
}
