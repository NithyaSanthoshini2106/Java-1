import java.util.ArrayList;

public class Testeightdowhileloop {
    public static void main(String[] args) {
      
        ArrayList<String> enames = new ArrayList<String>();
        enames.add("Nithya Spoorthi");
        enames.add("Kiran Raju");
        enames.add("Priya");
        enames.add("Modi");
        enames.add("Krishna Vamsi");

        
        System.out.println("Employee names using do-while loop:");
        int i = 0;

        if (!enames.isEmpty()) {
            do {
                System.out.println(enames.get(i));
                i++;
            } while (i < enames.size());
        }
    }
}
