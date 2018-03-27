import java.util.Scanner;


public class Rijeci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       int presses = scanner.nextInt();
       
       int seq[]= new int[50];
       
        seq[0]= 1;
        seq[1]=0;
        
        for (int i = 2; i < seq.length; i++) {
            seq[i]= seq[i-2]+seq[i-1];
            
        }
       System.out.println(seq[presses] + " "+ seq[presses+1]);
    }
}
