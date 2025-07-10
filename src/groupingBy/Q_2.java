package groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
      Question: Group numbers by even/odd (use modulo)
      Expected: Map<Integer, List<Integer>> where key is 0 for even, 1 for odd
 */
public class Q_2 {
    public static void main(String [] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Integer,List<Integer>>listMap = numbers.stream()
                .collect(Collectors.groupingBy(elem->elem%2==0 ? 0 : 1));
        System.out.println(listMap);
    }
}
