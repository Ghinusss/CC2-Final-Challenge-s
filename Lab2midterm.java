import java.util.Scanner;  

public class Labmidterm {  
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the length of the garden in meters: ");
        double length = scanner.nextDouble();  

        System.out.print("Enter the width of the garden in meters: ");
        double width = scanner.nextDouble();   

        
        double area = length * width;          
        double perimeter = 2 * (length + width); // 

              System.out.println("Length of the garden: " + length + " meters");
        System.out.println("Width of the garden: " + width + " meters");
        System.out.println("Area of the garden: " + area + " square meters");
        System.out.println("Perimeter of the garden: " + perimeter + " meters");

        
        scanner.close();
    }
}