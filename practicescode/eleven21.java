


import java.util.*;

public class eleven21 {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(101, "Nithya");
        students.put(102, "Spoorthi");
        students.put(103, "Adluru");

        System.out.println(students);
        for(Map.Entry<Integer, String> entry : students.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
