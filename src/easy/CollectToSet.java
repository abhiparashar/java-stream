package easy;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectToSet {
    public static void main(String[] args){
        List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        Set<String> uniqueElems = fruits.stream()
                .collect(Collectors.toSet());
        System.out.println(uniqueElems);
    }
}
