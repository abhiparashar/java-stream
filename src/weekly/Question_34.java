package weekly;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Question 34: Partition words by length > 5
public class Question_34 {
    public static void main(String[] args){
        List<String> words = Arrays.asList("cat", "elephant", "dog", "hippopotamus");
        Map<Boolean, List<String>>listMap = words.stream()
                .collect(Collectors.partitioningBy(word->word.length()>5));
        System.out.println(listMap);
    }
}
