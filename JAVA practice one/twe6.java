


import java.util.Scanner;

class twe6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num, sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit; 
            num /= 10;
        }

        if (sum == temp)
            System.out.println("It is an Armstrong number");
        else
            System.out.println("It is not an Armstrong number");
    }
}