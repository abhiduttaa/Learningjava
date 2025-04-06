public class CharToString {
    
        public static void main(String[] args) {
            char c = 'X';
            String strFromChar = String.valueOf(c);
            System.out.println("Char to String: " + strFromChar);
    
            String str = "Java";
            char charFromStr = str.charAt(0);
            char charFromStr1 = str.charAt(1);
            char charFromStr2 = str.charAt(2);
            char charFromStr3 = str.charAt(3);
            System.out.println("String to Char: " + charFromStr);
            System.out.println("String to Char: " + charFromStr1);
            System.out.println("String to Char: " + charFromStr2);
            System.out.println("String to Char: " + charFromStr3);
        }
    }
    
