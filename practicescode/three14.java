import java.util.*;

public class three14 {
    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();

        countries.put("India", "New Delhi");
        countries.put("USA", "Washington DC");
        countries.put("Japan", "Tokyo");
        countries.put("Australia", "Canberra");

        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
