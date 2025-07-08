package weekly;

import java.util.Arrays;
import java.util.List;

//Question 6: Skip first 2 elements and take next 3
public class Question_6 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer>skipList = numbers.stream()
                .skip(2)
                .limit(3)
                .toList();
        System.out.println(skipList);
    }
}
