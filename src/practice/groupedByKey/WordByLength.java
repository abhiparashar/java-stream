package practice.groupedByKey;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Group the words by their length.
public class WordByLength {
    public static void main(String[] args){
       List<String> words = List.of("apple", "bat", "car", "ant", "ball");
        Map<Integer, List<String>>listMap = words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(listMap);
    }
}
