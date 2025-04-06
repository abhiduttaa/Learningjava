import java.util.Scanner;

public class Addtwono {
    public static void main(String[] args) {
        int a,b,c;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Value a= ");
        
        
        a=obj.nextInt();

        System.out.print("Enter Value b= ");
        b=obj.nextInt();

        c = a+b;
        System.out.print("Sum = " + c);
    }
    
}
