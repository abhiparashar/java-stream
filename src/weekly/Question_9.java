package weekly;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

//Question 9: Convert to TreeSet (sorted)
public class Question_9 {
    public static void main(String[] args){
        List<String> words = Arrays.asList("zebra", "apple", "banana");
        TreeSet<String>treeset = words.stream()
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(treeset);
    }
}
