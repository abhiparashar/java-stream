package easy;

import java.util.Arrays;
import java.util.List;

public class CheckAnyMatch {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(10, 20, 30, 60, 40);
        boolean isMatch = numbers.stream()
                .anyMatch(num->num>50);
        System.out.println(isMatch);
    }
}
