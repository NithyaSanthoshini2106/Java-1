



public class twe18 {
    public static void main(String[] args) {
        int num = 1215678, rev = 0, temp = num;
        while(num > 0){
            rev = rev*10 + num%10;
            num /= 10;
        }
        if(temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
