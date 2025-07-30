interface Printable {
    void print();
}

class Printer implements Printable {
    public void print() {
        System.out.println("Printing document");
    }
}

public class twelve4 {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print();
    }
}
