class while1{
    public static void main(String[] args) {
        int[] product_prices={75,85,65,135,25};
        int total=0;
        int i=0;
        while(i<=product_prices.length-1){
            total=total+product_prices[i];
            i++;
        }
        System.out.println(total);
    }
}