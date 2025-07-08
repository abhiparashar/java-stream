package easy;

import java.util.Arrays;
import java.util.List;

public class FindFirst {
        public static void main(String[] args){
            List<String> words = Arrays.asList("apple", "banana", "java", "javascript");
            String firstWord = words.stream()
                            .filter(word->word.startsWith("j")).findFirst().orElse("No words found");
            System.out.println(firstWord);
        }
}
