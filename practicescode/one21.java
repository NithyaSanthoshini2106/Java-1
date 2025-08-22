

import java.util.*;

public class one21 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Nithya");
        names.add("Spoorthi");
        names.add("Adluru");
        names.add("Nithya"); 
        System.out.println(names);
        System.out.println(names.get(0));
        for(String name : names){
            System.out.println(name);
        }
    }
}
