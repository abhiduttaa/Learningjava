import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int a,b,ch;

        Scanner n = new Scanner(System.in);
        // Scanner n = new Scanner(System.in);
        System.out.println("Enter 1'st number =");
        a = n.nextInt();
        System.out.println("Enter 2'nd number = ");
        b=n.nextInt();
        // a=10;
        // b=20;
        System.out.println("1. 1 for Additon.\n2. 2 for subtrsction.\n3. 3 for Multiplication.\n4. 4 for Division. ");
        System.out.println("enter user choice ...!\n");
        System.out.println("Enter Your Choice = ");
        Scanner r = new Scanner(System.in);
        ch = r.nextInt();
        // while(true){
        switch (ch) {
            case 1:System.out.println("Sum =" +(a+b));
                
                break;
            case 2: System.out.println("Sub = "+ (a-b));
                break;
            case 3: System.out.println("Mult = "+ (a*b));
                break;
            case 4: System.out.println("Div= "+ (a/b));
                break;

        
            default:System.out.println("Invalid Choice ...!");
                break;
        }
    
    }
    
}
