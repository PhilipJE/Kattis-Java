import java.util.Scanner;


public class Skocimis {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int kang1 = sc.nextInt();
        int kang2 = sc.nextInt();
        int kang3 = sc.nextInt();
        
        
        
        System.out.println(Math.max(kang2-kang1,kang3-kang2)-1);
        
        
        
    }
}
