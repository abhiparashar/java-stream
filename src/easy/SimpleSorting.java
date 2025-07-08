package easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SimpleSorting {
    public static void main(String[] args){
        List<String> words = Arrays.asList("java", "python", "c", "javascript");
        List<String>list = words.stream()
                .sorted(Comparator.comparing(String::length))
                .toList();
        System.out.println(list
        );
    }
}
