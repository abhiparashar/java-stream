package weekly;

//Question 57: Transform and group in one operation
// Expected: Map<String, List<String>>

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question_57 {
    public static void main(String [] args){
        List<String> emails = Arrays.asList(
                "alice@company.com", "bob@company.com", "charlie@other.com",
                "diana@company.com", "eve@other.com"
        );

        Map<String, List<String>> result = emails.stream()
                .collect(Collectors.groupingBy(
                        email -> email.substring(email.indexOf("@") + 1),
                        Collectors.mapping(
                                email -> email.substring(0, email.indexOf("@")),
                                Collectors.toList()
                        )
                ));
    }
}
