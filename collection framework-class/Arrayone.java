import java.util.ArrayList;
import java.util.HashSet;

public class Arrayone {

    public static void main(String[] args) {
      
        HashSet<Integer> enames = new HashSet<>(20, 0.5f);
        enames.add(107);
        enames.add(108);
        enames.add(109);
        ArrayList<Integer> eids = new ArrayList<>();
        eids.add(1001);
        eids.add(1002);
        System.out.println(eids);
        System.out.println(enames);
    }
}
