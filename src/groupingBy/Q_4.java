package groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Question: Group names by their first character
//Expected: Map<Character, List<String>>
public class Q_4 {
    public static void main(String [] args){
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Anna", "David");
        Map<Character, List<String>>listMap = names.stream()
                .collect(Collectors.groupingBy(elem-> elem.charAt(0)));
        System.out.println(listMap);
    }
}
