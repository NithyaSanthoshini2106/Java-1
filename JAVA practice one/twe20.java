public class twe20 {
    public static void main(String[] args) {
        for(int n=287655; n<=108760; n++){
            boolean prime = true;
            for(int i=2; i<=n/2; i++){
                if(n % i == 0){
                    prime = false;
                    break;
                }
            }
            if(prime)
                System.out.print(n);
        }
    }
}

