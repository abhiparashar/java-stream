package weekly;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// Question 26: Get unique characters from all words
public class Question_26 {
    public static void main(String [] args){
        List<String> words = Arrays.asList("hello", "world", "java");
//        Set<String> uniqueWords  = words.stream()
//                .flatMap(elem->Arrays.stream(elem.split("")))
//                .collect(Collectors.toSet());
        Set<Character>charSet = words.stream()
                        .flatMapToInt(String::chars)
                         .mapToObj(c->(char)c)
                         .collect(Collectors.toSet());

        System.out.println(charSet);
    }
}
