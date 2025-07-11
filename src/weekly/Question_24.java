package weekly;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

// Question 24: Flatten nested lists
public class Question_24 {
    public static void main(String[] args){
        List<List<Integer>> nested = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        List<Integer>flattenList = nested.stream()
                .flatMap(Collection::stream)
                .toList();

        System.out.println(flattenList);
    }
}
