import java.util.*;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    double salary;
    String department;

    Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + salary + " - " + department;
    }
}

public class API10 {
    public static void main(String[] args) {
        
        List<Employee> employees = Arrays.asList(
            new Employee(101, "Nithya", 55000, "IT"),
            new Employee(102, "Spoorthi", 65000, "Finance"),
            new Employee(103, "Kiran", 45000, "IT"),
            new Employee(104, "Rahul", 70000, "HR"),
            new Employee(105, "Priya", 60000, "Finance")
        );
        System.out.println("Employees with salary > 50000:");
        employees.stream()
                 .filter(e -> e.salary > 50000)
                 .forEach(System.out::println);
        System.out.println("\nEmployees sorted by salary:");
        employees.stream()
                 .sorted((e1, e2) -> Double.compare(e1.salary, e2.salary))
                 .forEach(System.out::println);
        System.out.println("\nEmployee names in uppercase:");
        employees.stream()
                 .map(e -> e.name.toUpperCase())
                 .forEach(System.out::println);
        System.out.println("\nEmployees grouped by department:");
        Map<String, List<Employee>> deptMap = employees.stream()
                .collect(Collectors.groupingBy(e -> e.department));
        deptMap.forEach((dept, empList) -> {
            System.out.println(dept + ": " + empList);
        });
        double avgSalary = employees.stream()
                                    .mapToDouble(e -> e.salary)
                                    .average()
                                    .orElse(0.0);
        System.out.println("\nAverage Salary: " + avgSalary);
    }
}
