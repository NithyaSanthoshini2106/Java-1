public class StringType {
    public static void main(String[] args) {

        
        String str = "Nithya";
        str.concat(" Santhoshini ");
        System.out.println(str);  

        
        StringBuffer sb1 = new StringBuffer("Nithya");
        sb1.append(" Santhoshini ");
        System.out.println(sb1);  

        
        StringBuilder sb2 = new StringBuilder("Nithya");
        sb2.append(" Santhoshini ");
        System.out.println(sb2); 
    }
}
