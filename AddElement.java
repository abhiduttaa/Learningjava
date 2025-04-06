public class AddElement {
    public static void main(String[] args) {
        int[] a = {10,20,30};
        int s=0;

        for(int i: a){
            s=s+i;
        }
        System.out.println("Sum of array element = "+s);
    }
}
