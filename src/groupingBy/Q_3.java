package groupingBy;

import javax.crypto.MacSpi;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Question: Group words by their length
//Expected: Map<Integer, List<String>>
public class Q_3 {
    public static void main(String [] args){
        List<String> words = Arrays.asList("cat", "dog", "elephant", "ant", "tiger");
        Map<Integer,List<String >>listMap = words.stream()
                .collect(Collectors.groupingBy(elem->elem.length()));
        System.out.println(listMap);
    }
}
