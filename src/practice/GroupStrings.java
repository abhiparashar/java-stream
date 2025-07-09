package practice;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// 1. Group Strings by Length
public class GroupStrings {
    public static void main(String [] args){
        List<String> words = List.of("hi", "java", "map", "stream", "on");
        Map<Integer,List<String>>list = words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(list);
    }
}
