package practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Q4. Group Employees by Department
public class GroupEmployees {
    public static void main(String[] args){
        record Employee(String name, String dept, double salary) {}
        List<Employee> employees = List.of(
                new Employee("Alice", "HR", 50000),
                new Employee("Bob", "IT", 60000),
                new Employee("Charlie", "HR", 55000),
                new Employee("David", "IT", 65000)
        );

        Map<String, List<Employee>> list = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.dept));
        System.out.println(list);
    }
}
