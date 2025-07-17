

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Listarray10 {
    public static void main(String[] args) {
        List<String> enames = Arrays.asList("Nithya", "Rajunithu", "Raju", "Kiran");

        List<String> new_Enames1 = new ArrayList<String>();
        List<String> new_Enames2 = new ArrayList<String>();
        for (String ename:enames) {
            if(ename.startsWith("R")){
                new_Enames1.add(ename);
            }

        }
        System.out.println(new_Enames1);
        System.out.println(new_Enames2);
            
        
    }
}