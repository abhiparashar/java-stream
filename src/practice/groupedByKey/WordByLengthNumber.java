package practice.groupedByKey;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// → Group numbers by the number of digits.
public class WordByLengthNumber {
    public static void main(String [] args){
        List<Integer> numbers = List.of(1, 11, 111, 2, 22, 222);
        Map<Integer,List<Integer>>listMap = numbers.stream()
                .collect(Collectors.groupingBy(number->String.valueOf(number).length()));
        System.out.println(listMap);

    }
}
