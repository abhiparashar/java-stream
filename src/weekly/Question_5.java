package weekly;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Question 5: Get shortest 2 words alphabetically
public class Question_5 {
    public static void main(String[] args){
        List<String> words = Arrays.asList("elephant", "cat", "dog", "bird");
        List<String> filtered = words.stream()
                .sorted(Comparator.comparing(String::length).thenComparing(String::compareTo))
                .limit(2)
                .toList();
        System.out.println(filtered);
    }
}
