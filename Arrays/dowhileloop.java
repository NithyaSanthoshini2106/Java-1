public class dowhileloop {

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

        // 3️⃣ While Loop
        System.out.println("\nUsing while loop:");
        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }

        // 4️⃣ Do-while Loop
        System.out.println("\nUsing do-while loop:");
        int j = 0;
        do {
            System.out.println(numbers[j]);
            j++;
        } while (j < numbers.length);

    }
}
