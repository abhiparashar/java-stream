package weekly;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Question 4: Get top 3 largest numbers
public class Question_4 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3, 7);
        List<Integer>highest = (List<Integer>) numbers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();
        System.out.println(highest);
    }
}
