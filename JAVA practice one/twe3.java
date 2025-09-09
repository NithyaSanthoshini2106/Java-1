


import java.util.*;
class twe3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), even=0, odd=0;
    while(n>0){
      int d=n%10;
      if(d%2==0) even+=d; else odd+=d;
      n/=10;
    }
    System.out.println(even);
    System.out.println(odd);
  }
}