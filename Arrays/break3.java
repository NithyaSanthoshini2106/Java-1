public class break3 {

    public static void main(String[] args) {

        int[] product_prices = {34, 45, 56, 67, 78, 67};
        int total = 0;

        for (int i = 0; i < product_prices.length; i++) {
            total = total + product_prices[i];
        }

        System.out.println("Total: " + total);
    }

}
