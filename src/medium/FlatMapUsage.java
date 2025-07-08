package medium;

import java.util.Arrays;
import java.util.List;

public class FlatMapUsage {
    public static void main(String[] args){
        List<String> sentences = Arrays.asList(
                "Java is great",
                "Streams are powerful",
                "Java streams are amazing"
        );
        long uniqueWords = sentences.stream()
                .flatMap(sentence->Arrays.stream(sentence.toUpperCase().split("\\s+")))
                .distinct()
                .count();
        System.out.println(uniqueWords);
    }
}

//ComplexFilteringAndMapping
