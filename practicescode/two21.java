



import java.util.*;

public class two21 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Nithya Raju ");
        names.add("Spoorthi Raju");
        names.add("Adluru Nithya Spoorthi");
        names.add("Nithya Raju Nithu");
        System.out.println(names);
        System.out.println(names.get(0));
        for(String name : names){
            System.out.println(name);
        }
    }
}
