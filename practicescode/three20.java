



public class three20 {
    public static void main(String[] args) {
        int num = 153, sum = 0, temp = num;

        while(num > 0) {
            int d = num % 10;
            sum += d*d*d;
            num /= 10;
        }

        if(sum == temp)
            System.out.println(temp);
        else
            System.out.println(temp);
    }
}
