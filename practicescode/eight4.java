class Person {
    private String name;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
}

public class eight4 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Nithya");
        System.out.println("Name: " + p.getName());
    }
}
