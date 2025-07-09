package practice;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// Q3. Count Occurrences
public class Count_Occurrences {
    public static void main(String[] args){
        List<String> words = List.of("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Long> count = words.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(count);
    }
}
