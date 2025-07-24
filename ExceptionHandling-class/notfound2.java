public class notfound2 {



    public static void main(String[] args) {
        String ename="Nithya Spoorthi";
        System.out.println(ename.length());
        try{

        }
        catch(NullPointerException ae){
            System.out.println(ae.getMessage());
        }


        String ename2=null;
        System.out.println(ename2.length());
    }
    
}
