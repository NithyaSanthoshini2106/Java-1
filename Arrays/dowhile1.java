public class dowhile1{

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};


        // 4️⃣ Do-while Loop
        System.out.println("\nUsing do-while loop:");
        int j = 0;
        do {
            System.out.println(numbers[j]);
            j++;
        } while (j < numbers.length);

    }
}
