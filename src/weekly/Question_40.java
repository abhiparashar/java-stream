package weekly;

import java.util.*;
import java.util.stream.Collectors;

// Get unique words, longer than 3 chars, uppercase, sorted
// Expected: ["AMAZING", "GREAT", "JAVA", "POWERFUL", "STREAMS"]

public class Question_40 {
    public static void main(String [] args){
        List<String> sentences = Arrays.asList(
                "Java is great",
                "Streams are powerful",
                "Java streams are amazing"
        );
        Set<String> list = sentences.stream()
                .map(elem->elem.split(" "))
                .flatMap(Arrays::stream)
                .filter(elem->elem.length()>3)
                .map(String::toUpperCase)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println(list);
    }
}
