package weekly;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Question 29: Group numbers by even/odd
public class Question_29 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<String,List<Integer>>filteredMap = numbers.stream()
                .collect(Collectors.groupingBy(num->num % 2==0 ? "Even":"Odd"));
        System.out.println(filteredMap);
    }
}
