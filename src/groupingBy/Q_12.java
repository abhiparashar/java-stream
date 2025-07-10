package groupingBy;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Question: Group by value and get statistics (count, sum, average, min, max)
//Expected: Map<Integer, IntSummaryStatistics>
public class Q_12 {
    public static void main(String [] args){
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
        Map<Integer, IntSummaryStatistics>map = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.summarizingInt(number-> number)));

        System.out.println(map);
    }
}
