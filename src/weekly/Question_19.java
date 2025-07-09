package weekly;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

//Question 19: Get second largest number
public class Question_19 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3);
        Integer num = numbers.stream()
                .sorted(Comparator.comparing(Integer::intValue))
                .skip(1)
                .limit(1)
                .findFirst().orElse(0);
        System.out.println(num);
    }
}
