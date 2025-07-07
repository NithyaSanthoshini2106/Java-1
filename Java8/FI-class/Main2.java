import java.util.ArrayList;

public class Main2 {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();  
    names.add("Nithya");
    names.add("Spoorthi");
    names.add("Nithu");
    names.add("Raju");
    names.forEach(n -> System.out.println(n));
  }
}
