import java.util.*;

public class twentyfive12 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 5, 4, 3};
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        HashMap<Integer, List<Integer>> groupMap = new HashMap<>();
        for (int key : freqMap.keySet()) {
            int freq = freqMap.get(key);
            groupMap.computeIfAbsent(freq, k -> new ArrayList<>()).add(key);
        }

        System.out.println("Groups of elements by frequency:");
        for (int freq : groupMap.keySet()) {
            System.out.println("Frequency " + freq + ": " + groupMap.get(freq));
        }
    }
}
