package weekly;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

//Question 15: Get statistics for numbers
public class Question_15 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        IntSummaryStatistics stats = numbers.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println(stats);
    }
}
