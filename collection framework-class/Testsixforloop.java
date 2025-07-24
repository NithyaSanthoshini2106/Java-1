import java.util.ArrayList;

public class Testsixforloop {
    public static void main(String[] args) {
        ArrayList<String> enames = new ArrayList<String>();
        enames.add("Nithya Spoorthi");
        enames.add("Kiran Raju");
        enames.add("Priya");
        enames.add("Modi");
        enames.add("Krishna Vamsi");

       
        System.out.println("Employee Names: " + enames);

        
        System.out.println("Printing names using for loop:");
        for (int i = 0; i < enames.size(); i++) {
            System.out.println(enames.get(i));
        }
    }
}
