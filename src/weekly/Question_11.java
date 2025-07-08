package weekly;

import java.util.Arrays;
import java.util.List;

// Question 11: Check if all numbers are positive
public class Question_11 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        boolean isPositive = numbers.stream()
                .allMatch(elem->elem>0);
        System.out.println(isPositive);
    }
}
