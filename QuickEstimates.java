import java.util.Scanner;


public class Quick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int cases = scanner.nextInt();
        
        for (int i = 0; i < cases; i++) {
            String digits = scanner.next();
            
            System.out.println(digits.length());
        }
    }
}
