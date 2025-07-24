public class NPE4 {

    public static void main(String[] args) {
        try {
            //String ename = "Nithya";
            String ename = null;
            System.out.println(ename.length());  
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

}
