package weekly;

import java.util.Arrays;
import java.util.List;

//Get uppercase names longer than 4 characters
public class Question_2 {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana", "Eve");
        List<String>filteredCharacters = names.stream()
                .filter(word->word.length()>4)
                .map(String::toUpperCase)
                .toList();
        System.out.println(filteredCharacters);
    }
}
