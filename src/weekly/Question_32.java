package weekly;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
public class Question_32 {
    public static void main(String [] args){
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Map<Character,Long>list = names.stream()
                        .flatMapToInt(String::chars)
                        .mapToObj(c->(char)c)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(list);
    }
}
