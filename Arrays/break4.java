public class break4 {

    public static void main(String[] args) {

        int[] product_prices = {34, 45, 56, 67, 78, 67};  

        int sum = 0;
        int i = 0;

        while (i < product_prices.length) {
            sum = sum + product_prices[i];
            i = i + 1;  
        }

       
        System.out.println("Total sum: " + sum);
    }

}
