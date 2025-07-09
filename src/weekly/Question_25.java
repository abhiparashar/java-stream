package weekly;

import java.util.Arrays;
import java.util.List;

//Question 25: Get all words from sentences
public class Question_25 {
    public static void main(String[] args){
        List<String> sentences = Arrays.asList(
                "Hello world",
                "Java streams are powerful",
                "Practice makes perfect"
        );

        List<String>list = sentences.stream()
                .flatMap(elem->Arrays.stream(elem.split(" ")))
                .toList();
        System.out.println(list);
    }
}
