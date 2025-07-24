public class dowhile{

    public static void main(String[] args) {

        int[] product_prices = {34, 45, 56, 67, 78, 67};

        int sum = 0;
        int i = 0;

        do {
            sum = sum + product_prices[i];
            i++;
            
        } while (i < product_prices.length);

        System.out.println("Total sum: " + sum);

    }

}
