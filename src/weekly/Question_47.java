package weekly;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Question 47: Group by department, then by salary range
// Expected: Map<String, Map<String, List<Employee>>>
public class Question_47 {
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
                new Employee("Diana", "Marketing", 62000),
                new Employee("Eve", "Marketing", 90000),
                new Employee("Frank", "Marketing", 58000)
        );

        Map<String , Map<String , List<Employee>>>list = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.groupingBy(employee -> employee.getSalary()>80000 ? "High":employee.getSalary()<60000?"Low":"Medium")));


        System.out.println(list);

    }
}
