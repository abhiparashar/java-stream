package weekly;

import java.util.Arrays;
import java.util.List;

// Question 14: Calculate sum of all numbers
public class Question_14 {
    public static void main(String [] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
