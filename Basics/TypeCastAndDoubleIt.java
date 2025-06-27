import java.util.Scanner;

public class TypeCastAndDoubleIt {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        // TypeCast to int double it and print
        //convert String(num ="5") to int(5)
        int a=Integer.parseInt(num);
        //Multiply by 2
        System.out.println(a*2);//5*2=10
    }
}
