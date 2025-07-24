public class Stringone {
    public static void main(String[] args) {

        
        String str = "Adluru nithya";
        for (int i = 0; i < 5; i++) {
            str = str + "Nithu";
        }
        System.out.println("String: " + str);  

        
        StringBuffer sb1 = new StringBuffer("Adluru Spoorthi");
        for (int i = 0; i < 5; i++) {
            sb1.append("Nithu");
        }
        System.out.println("StringBuffer: " + sb1);  

        
        StringBuilder sb2 = new StringBuilder("Adluru Santhoshini");
        for (int i = 0; i < 5; i++) {
            sb2.append("Nithu");
        }
        System.out.println("StringBuilder: " + sb2);  
    }
}
