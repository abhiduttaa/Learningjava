import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
        int a,b,c;
        Scanner s =new Scanner(System.in);
        System.out.println("Enter 1st Number");
        a= s.nextInt();
        System.out.println("Enter 2nd Number");
        b=s.nextInt();

        c= a+b;

        System.out.println("Addition of two Number is = "+ c);
    }
}