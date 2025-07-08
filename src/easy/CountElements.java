package easy;

import java.util.Arrays;
import java.util.List;

public class CountElements {
    public static void main(String[] args){
        List<String> words = Arrays.asList("cat", "elephant", "dog", "hippopotamus");
        long count = words.stream()
                .filter(word->word.length()>4)
                .count();
        System.out.println(count);
    }
}
