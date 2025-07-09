package weekly;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Question 37: Create formatted employee list
public class Question_37 {
    public static class Employee{
        private final String name;
        private final String dept;
        private final Integer salary;

        public Employee(String name, String dept, Integer salary) {
            this.name = name;
            this.dept = dept;
            this.salary = salary;
        }

        public String getDept() {
            return dept;
        }

        public String getName() {
            return name;
        }

        public Integer getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{name='" + name + "', dept='" + dept + "'}";
        }
    }
    public static void main(String[] args ){
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Engineering", 75000),
                new Employee("Bob", "Marketing", 60000),
                new Employee("Charlie", "Engineering", 80000),
                new Employee("Diana", "Marketing", 65000)
        );

        String list = employees.stream()
                .map(emp->emp.name)
                .collect(Collectors.joining(", ", "[", "]"));

        System.out.println(list);
    }
}
