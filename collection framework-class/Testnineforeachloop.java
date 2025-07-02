import java.util.ArrayList;

public class Testnineforeachloop {
    public static void main(String[] args) {
        
        ArrayList<String> enames = new ArrayList<String>();
        enames.add("Nithya Spoorthi");
        enames.add("Kiran Raju");
        enames.add("Priya");
        enames.add("Modi");
        enames.add("Krishna Vamsi");

        
        System.out.println("Employee names using for-each loop:");
        for (String name : enames) {
            System.out.println(name);
        }
    }
}