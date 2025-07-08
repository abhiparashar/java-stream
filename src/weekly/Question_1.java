package weekly;

import java.util.Arrays;
import java.util.List;
// Question 1: Filter even numbers and square them
public class Question_1 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer>squaredValue = numbers.stream()
                .filter(number->number%2==0)
                .map(num->num *num)
                .toList();
        System.out.println(squaredValue);
    }
}
