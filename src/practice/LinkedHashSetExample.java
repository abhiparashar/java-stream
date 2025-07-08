package practice;
//Problem: Convert a list to a LinkedHashSet maintaining insertion order
import java.util.Arrays;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.ArrayList;

public class LinkedHashSetExample {
    public static void main(String[] args){
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana");

        List<String> deduplicatedOrderedList = new ArrayList<>(
                new LinkedHashSet<>(words)
        );

        System.out.println(deduplicatedOrderedList);
    }
}