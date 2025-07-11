package weekly;
//Question 55: Department with most employees
// Expected: Optional<String>

import java.util.*;
import java.util.stream.Collectors;

public class Question_55 {
    public static class Employee {
        private String name;
        private String department;
        private double salary;

        // Constructor
        public Employee(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        // Getters
        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public double getSalary() {
            return salary;
        }

        // Optional: toString() for printing
        @Override
        public String toString() {
            return name + " (" + department + ") - $" + salary;
        }
    }

    public static void main(String [] args){
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Engineering", 75000),
                new Employee("Bob", "Engineering", 55000),
                new Employee("Charlie", "Engineering", 85000),
                new Employee("Angel", "Engineering", 90000),
                new Employee("Diana", "Marketing", 62000),
                new Employee("Eve", "Marketing", 90000),
                new Employee("Frank", "Marketing", 58000)
        );

        Optional<String> result = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()
                ))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);

        System.out.println(result);
    }
}
