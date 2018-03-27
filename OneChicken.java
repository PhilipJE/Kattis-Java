import java.util.Scanner;


public class OneChicken {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int folks = scanner.nextInt();
        int chickens = scanner.nextInt();
        
        int ans = chickens - folks;
            
        if(ans>1){
            System.out.println("Dr. Chaz will have " + ans + " pieces of chicken left over!");
        }
        if (ans<-1){
          
            System.out.println("Dr. Chaz needs " + -ans + " more pieces of chicken!");
        }    
        if(ans==1){
            System.out.println("Dr. Chaz will have 1 piece of chicken left over!");
        }
        if(ans==-1){
            System.out.println("Dr. Chaz needs 1 more piece of chicken!");
        }   
    }
}
