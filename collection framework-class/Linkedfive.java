import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linkedfive {

    public static void main(String[] args) {
        HashSet eids=new HashSet<>(20,05f);
        eids.add(101);
        eids.add(101);
        eids.add(101);

        eids.add(101);
        eids.add(101);
        eids.add(101);

        eids.add(101);
        eids.add(101);
        eids.add(101);
        eids.add("Rahul");
        eids.add(101);
        System.out.println(eids);
        LinkedHashSet hs=new LinkedHashSet<>(20,05f);
        hs.add(101);
        hs.add("Nithya");
        hs.add(101);
        hs.add(102);
        hs.add(456098.77777f);
        hs.add("Null");
        
        System.out.println(hs);
    }
    
}
