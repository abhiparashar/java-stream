package weekly;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Question 28: Group words by their length
public class Question_28 {
    public static void main(String[] args){
        List<String> words = Arrays.asList("cat", "elephant", "dog", "bird");
        Map<Integer, List<String>>map = words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(map);
    }
}
