import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperWords {
    public static void main(String [] args){
        List<String> words = Arrays.asList("hello", "world", "java", "streams");
        List<String> upperCaseWords = words.stream()
                .map(word->word.toUpperCase())
                .toList();
        System.out.println(upperCaseWords);
    }
}
