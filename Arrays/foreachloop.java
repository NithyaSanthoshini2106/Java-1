public class foreachloop{

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        // 1️⃣ For Loop
        System.out.println("Using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 2️⃣ For-each Loop
        System.out.println("\nUsing for-each loop:");
        for (int num : numbers) {
            System.out.println(num);
        }


    }
}
