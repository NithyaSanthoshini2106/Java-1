public class abcd {

    public static void main(String[] args) {
        int[] eids = new int[4];
        eids[0] = 101;  

        Object[] objs = new Object[4];  

        objs[0] = "Nithya";      
        objs[1] = 101;           
        objs[2] = 450000.34;     
        objs[3] = true;          
        // objs[4] = "N";        

        
        for (Object obj : objs) {
            System.out.println(obj);
        }
    }
}
