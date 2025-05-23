public class dataone {
    public static void main(String[] args) {
        // String
        String message = "Hello, Java!";
        System.out.println("Message: " + message);

        // Array 
        int[] numbers = {10, 20, 30};
        System.out.print("Numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Object 
        Person person = new Person("Nithya", 25);
        person.displayInfo();
    }
}

class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
