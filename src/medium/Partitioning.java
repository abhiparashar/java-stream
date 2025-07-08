package medium;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partitioning {
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
                new Employee("Alice", "Engineering", 70000),        // Remove GroupByProperty.
                new Employee("Bob", "Marketing", 60000),
                new Employee("Charlie", "Engineering", 80000),
                new Employee("Diana", "Marketing", 65000)
        );

        Map<Boolean, List<Employee>> partitioned = employees.stream()
                .collect(Collectors.partitioningBy(employee -> employee.getSalary() > 70000));

        System.out.println(partitioned);
    }
}
