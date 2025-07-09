package weekly;

import java.util.List;
import java.util.stream.Stream;

//Question 18: Generate first 5 even numbers
public class Question_18 {
    public static void main(String[] args){
        List<Integer>list = Stream.iterate(0,n->n+2)
                .limit(5)
                .toList();
        System.out.println(list);
    }
}
