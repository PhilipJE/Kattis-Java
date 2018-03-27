import java.util.Scanner;


public class pizzacrust {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int radius = scanner.nextInt();
        int crust = scanner.nextInt();
        
        double area = (radius*radius)*Math.PI;
        double cheesearea= ((radius-crust)*(radius-crust))*Math.PI;
        
        double perc = cheesearea/area;
        
        System.out.println(perc*100);
        
        
        
    }
}
