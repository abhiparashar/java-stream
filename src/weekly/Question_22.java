package weekly;

import java.util.Arrays;
import java.util.List;

//Question 22: Get initials of names longer than 4 characters
public class Question_22 {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana");
        List<String>modifiedList = names.stream()
                .filter(num->num.length()>4)
                .map(elem-> elem.substring(0,1))
                .toList();
        System.out.println(modifiedList);
    }
}
