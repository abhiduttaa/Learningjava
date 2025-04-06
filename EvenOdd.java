import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args){
        int n;

        Scanner oe = new Scanner(System.in);
        n= oe.nextInt();

        if(n%2 == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}