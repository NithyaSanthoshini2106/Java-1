import java.util.ArrayList;

public class Testone {
    public static void main(String[] args) {
       ArrayList<Integer> eids=new ArrayList<Integer>();
       eids.add(101);
       eids.add(102);
       eids.add(103);
       eids.add(104);
       System.out.println(eids);
        for (Integer eid:eids) {
            System.out.println(eid);
        }
    }
}