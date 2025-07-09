package weekly;

import java.util.Arrays;
import java.util.List;

//Question 23: Get names of Engineering employees earning > 70k
public class Question_23 {
    public static class Employee{
        private final String name;
        private final String dept;
        private final int salary;

        public Employee(String name, String dept, int salary) {
            this.name = name;
            this.dept = dept;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public String getDept() {
            return dept;
        }

        public int getSalary() {
            return salary;
        }
    }
    public static void main(String[] args){
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Engineering", 75000),
                new Employee("Bob", "Marketing", 60000),
                new Employee("Charlie", "Engineering", 80000),
                new Employee("Diana", "Marketing", 65000)
        );

        List<String>filteredList = employees.stream()
                .filter(elem-> elem.dept.equalsIgnoreCase("Engineering"))
                .filter(ele->ele.salary>70000)
                .map(elem->elem.name)
                .toList();

        System.out.println(filteredList);
    }
}
