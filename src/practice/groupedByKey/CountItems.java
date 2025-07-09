package practice.groupedByKey;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//→ Count how many times each word appears.
public class CountItems {
    public static void main(String [] args){
        List<String> words = List.of("apple", "bat", "bat", "car", "car", "car");
        Map<String,Long>wordsList = words.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(wordsList);

    }
}
