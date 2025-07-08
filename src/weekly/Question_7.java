package weekly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

//Question 7: Remove duplicates maintaining order
public class Question_7 {
    public static void main(String[] args){
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana");
        LinkedHashSet<String> duplicateList = new LinkedHashSet<>(words);
        List<String>list = new ArrayList<>(duplicateList);
        System.out.println(list);
    }
}
