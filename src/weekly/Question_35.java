package weekly;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Question 35: Partition numbers and count each partition
public class Question_35 {
    public static void main(String [] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, Long> list = numbers.stream()
                .collect(Collectors.partitioningBy(num->num%2==0,Collectors.counting()));
        System.out.println(list);
    }
}
