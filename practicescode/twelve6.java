public class twelve6 {
    public static void main(String[] args) {
        String sentence = "apple,banana,grape";
        String[] fruits = sentence.split(",");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
