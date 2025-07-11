package weekly;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

//Question 46: Department with highest average salary
public class Question_46 {
    public static class Employee {
        private String name;
        private String department;
        private double salary;
        private LocalDate hireDate;
        private String city;

        public Employee(String name, String department, double salary, LocalDate hireDate, String city) {
            this.name = name;
            this.department = department;
            this.salary = salary;
            this.hireDate = hireDate;
            this.city = city;
        }

        // Getters and Setters
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getDepartment() { return department; }
        public void setDepartment(String department) { this.department = department; }

        public double getSalary() { return salary; }
        public void setSalary(double salary) { this.salary = salary; }

        public LocalDate getHireDate() { return hireDate; }
        public void setHireDate(LocalDate hireDate) { this.hireDate = hireDate; }

        public String getCity() { return city; }
        public void setCity(String city) { this.city = city; }

        @Override
        public String toString() {
            return "Employee{name='" + name + "', dept='" + department + "', salary=" + salary + ", city='" + city + "'}";
        }
    }
    public static void main(String [] args){
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT", 75000, LocalDate.of(2020, 1, 15), "Mumbai"),
                new Employee("Bob", "IT", 82000, LocalDate.of(2019, 3, 10), "Delhi"),
                new Employee("Charlie", "HR", 65000, LocalDate.of(2021, 6, 1), "Mumbai"),
                new Employee("Diana", "HR", 58000, LocalDate.of(2022, 2, 14), "Bangalore"),
                new Employee("Eve", "Finance", 90000, LocalDate.of(2018, 8, 20), "Mumbai"),
                new Employee("Frank", "Finance", 95000, LocalDate.of(2017, 11, 5), "Delhi"),
                new Employee("Grace", "IT", 78000, LocalDate.of(2020, 9, 12), "Bangalore"),
                new Employee("Henry", "Marketing", 70000, LocalDate.of(2021, 4, 8), "Mumbai"),
                new Employee("Ivy", "Marketing", 72000, LocalDate.of(2020, 7, 22), "Delhi"),
                new Employee("Jack", "IT", 85000, LocalDate.of(2019, 12, 3), "Mumbai"),
                new Employee("Kate", "HR", 62000, LocalDate.of(2022, 5, 18), "Bangalore"),
                new Employee("Leo", "Finance", 88000, LocalDate.of(2018, 10, 30), "Delhi"),
                new Employee("Mia", "IT", 76000, LocalDate.of(2021, 1, 25), "Mumbai"),
                new Employee("Noah", "Marketing", 68000, LocalDate.of(2022, 3, 12), "Bangalore"),
                new Employee("Olivia", "Finance", 92000, LocalDate.of(2019, 6, 7), "Mumbai")
        );

        Optional<String> result = employees.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary))).entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey);

        System.out.println(result);
    }
}
