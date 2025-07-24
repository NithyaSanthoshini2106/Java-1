public class Filenotfound {


    public static void main(String[] args) {
        
        int[] eids={111,222,33,444};
        System.out.println("Nithya Santhoshini");

        try {

            System.out.println(eids[0]);
            System.out.println(eids[1]);
            System.out.println(eids[2]);
            System.out.println(eids[3]);
            System.out.println(eids[4]);
        }
        catch (Exception e){
            System.out.println("array out of index");


        }
        System.out.println(eids[3]);
        System.out.println(eids[2]);
        
    }
    
}
