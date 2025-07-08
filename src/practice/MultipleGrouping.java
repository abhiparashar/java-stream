package practice;

//Problem: Group employees by department and salary range (High: >75k, Low: <=75k)
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MultipleGrouping {
    public static class Employee{
        private final String name;
        private final String department;
        private final int salary;

        public Employee(String name, String department, int salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public int getSalary() {
            return salary;
        }

        public String getDepartment() {
            return department;
        }

        public String getName() {
            return name;
        }
    }
    public static void main(String[] args){
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Engineering", 70000),
                new Employee("Bob", "Marketing", 60000),
                new Employee("Charlie", "Engineering", 80000),
                new Employee("Diana", "Marketing", 65000)
        );

        Map<String,Map<String, List<Employee>>>groupedEmployee = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.groupingBy(employee -> employee.getSalary()>75000 ? "HIGH":"lOW")));

        System.out.println(groupedEmployee);
    }
}
