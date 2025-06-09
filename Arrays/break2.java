public class break2 {

    public static void main(String[] args) {

        int [] product_prices = { 34,45,56,67,78,67 };
        int total=0;

        for(int price : product_prices) {
            total = total + price;
        }
        System.out.println(total);
    }
    
}
