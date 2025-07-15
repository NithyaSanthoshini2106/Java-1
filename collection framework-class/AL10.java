import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class AL10 {

    public static void main(String[] args) {
        List<String> enames = Arrays.asList("nithya", "Spoorthi", "RAju");
        List<String> new_Enames=new ArrayList<String>();
        for (String ename:enames){
            new_Enames.add(ename.toUpperCase());

        }
        System.out.println(enames);
        System.out.println(new_Enames);
    }
}
