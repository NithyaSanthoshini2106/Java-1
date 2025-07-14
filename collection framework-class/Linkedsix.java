import java.util.LinkedHashSet;

public class Linkedsix {

    public static void main(String[] args) {
        LinkedHashSet<Object> hs = new LinkedHashSet<>(20, 0.5f);
        hs.add(101);
        hs.add("Nithya");
        hs.add(101);                  
        hs.add(102);
        hs.add(456098.77777f);
        for (Object obj : hs) {
            System.out.println(obj);
        }


        System.out.println(hs);
    }
}
