package weekly;

import java.util.*;
import java.util.stream.Collectors;

//Question 8: Get unique lengths of words
public class Question_8 {
    public static void main(String[] args){
        List<String> words = Arrays.asList("hello", "world", "java", "code");
//        LinkedHashSet<Integer>uniqueWords = words.stream()
//                .map(String::length)
//                .collect(Collectors.toCollection(LinkedHashSet::new));
//        List<Integer>sortedLength = uniqueWords.stream()
//                .sorted(Comparator.naturalOrder())
//                .toList();
        Set<Integer>set = words.stream()
                    .map(String::length)
                    .collect(Collectors.toSet());
        System.out.println(set);
    }
}
