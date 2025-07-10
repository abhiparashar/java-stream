package groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Question: Group numbers by whether they're greater than 30
//Expected: Map<Boolean, List<Integer>>
public class Q_5 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(10, 25, 30, 45, 50);
        Map<Boolean, List<Integer>>listMap = numbers.stream()
                .collect(Collectors.groupingBy(ele->ele>30));
        System.out.println(listMap);
    }

}
