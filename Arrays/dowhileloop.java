public class dowhileloop {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        //  For Loop
        System.out.println("Using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //  For-each Loop
        System.out.println("\nUsing for-each loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // While Loop
        System.out.println("\nUsing while loop:");
        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }

        // Do-while Loop
        System.out.println("\nUsing do-while loop:");
        int j = 0;
        do {
            System.out.println(numbers[j]);
            j++;
        } while (j < numbers.length);

    }
}
