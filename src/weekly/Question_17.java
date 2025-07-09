package weekly;

import java.util.Arrays;
import java.util.List;

//Question 17: Convert to double and get average
public class Question_17 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        double avg = numbers.stream()
                .mapToLong(Integer::longValue)
                .average().orElse(0.0);
        System.out.println(avg);
    }
}
