class Test2 {
    String title;
    String author;

    // Constructor
    Test2 (String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Overriding toString() method
    public String toString() {
        return "Book Title: " + title + ", Author: " + author;
    }

    public static void main(String[] args) {
        Test2 b1 = new Test2("Java Basics", "Nithya");
        System.out.println(b1);              // Implicit toString()
        System.out.println(b1.toString());   // Explicit toString()
    }
}
