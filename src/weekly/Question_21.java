package weekly;

import java.util.Arrays;
import java.util.List;

//Question 21: Get squared values of even numbers greater than 2
public class Question_21 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer>modifiedList = numbers.stream()
                .filter(num->num%2==0)
                .filter(num->num>2)
                .map(num->num*num)
                .toList();
        System.out.println(modifiedList);
    }
}
