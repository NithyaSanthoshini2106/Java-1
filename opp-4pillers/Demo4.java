// Abstraction
abstract class Employee {
    abstract void calculateSalary(); // Abstract method
}

// Inheritance + Encapsulation
class FullTimeEmployee extends Employee {
    private String name;      // Encapsulation: private variables
    private int monthlySalary;

    // Encapsulation: public setters
    public void setName(String name) {
        this.name = name;
    }

    public void setMonthlySalary(int salary) {
        this.monthlySalary = salary;
    }

    // Implementing abstract method
    void calculateSalary() {
        System.out.println("Full-time Salary for " + name + ": " + monthlySalary);
    }
}

class PartTimeEmployee extends Employee {
    private String name;
    private int hoursWorked;
    private int hourlyRate;

    public void setName(String name) {
        this.name = name;
    }

    public void setHoursWorked(int hours) {
        this.hoursWorked = hours;
    }

    public void setHourlyRate(int rate) {
        this.hourlyRate = rate;
    }

    void calculateSalary() {
        int salary = hoursWorked * hourlyRate;
        System.out.println("Part-time Salary for " + name + ": " + salary);
    }
}

public class Demo4 {
    public static void main(String[] args) {
        FullTimeEmployee ft = new FullTimeEmployee();
        ft.setName("Nithya");
        ft.setMonthlySalary(30000);
        ft.calculateSalary();

        PartTimeEmployee pt = new PartTimeEmployee();
        pt.setName("Spoorthi");
        pt.setHoursWorked(120);
        pt.setHourlyRate(200);
        pt.calculateSalary();
    }
}
