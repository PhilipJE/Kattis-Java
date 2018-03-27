import java.util.Scanner;


public class Soylent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int cases = scanner.nextInt();
        
        for (int i = 0; i < cases; i++) {
            int b = scanner.nextInt();
            
            if(b%400==0){
                System.out.println(b/400);
            }
            else{
                System.out.println(b/400+1);
            }
        }
    }
}

