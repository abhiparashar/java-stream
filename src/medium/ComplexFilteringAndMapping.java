package medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Problem: Find employees with salary > 65000, get their names in uppercase
public class ComplexFilteringAndMapping {
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
        List<GroupByProperty.Employee> employees = Arrays.asList(
                new GroupByProperty.Employee("Alice", "Engineering", 70000),
                new GroupByProperty.Employee("Bob", "Marketing", 60000),
                new GroupByProperty.Employee("Charlie", "Engineering", 80000),
                new GroupByProperty.Employee("Diana", "Marketing", 65000)
        );

        List<String>empoyeesList = employees.stream()
                .filter(employee -> employee.getSalary()>65000)
                .map(GroupByProperty.Employee::getName)
                .map(String::toUpperCase)
                .toList();

        System.out.println(empoyeesList);

    }
}
