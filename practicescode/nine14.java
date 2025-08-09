import java.util.*;

public class nine14 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Nithya", 25);
        map.put("Raju", 30);

        for (Map.Entry<String, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() +  entry.getValue());
    }
}
