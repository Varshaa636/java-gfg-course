import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
       // int m=6,n=7;
       Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int temp=m; //using third variable
        m=n;
        n=temp;
        System.out.println("value of m is: "+ m + " and value of n is: " + n);
    }
}
