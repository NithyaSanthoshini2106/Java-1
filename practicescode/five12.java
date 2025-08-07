public class five12 {
    public static void main(String[] args) {
        String[] keys = {"dog", "cat", "fish"};
        int tableSize = 10;

        for (String key : keys) {
            int hash = key.hashCode(); // built-in hash
            int index = Math.abs(hash) % tableSize; // map to table
            System.out.println("Key: " + key + " => Index: " + index);
        }
    }
}
