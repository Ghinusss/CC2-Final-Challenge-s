//code by : Ambales Geneses L.
//Sep 13,2024
//CITCS- 1N - Group A


import java.util.Scanner;

public class Lab3midterm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declare variables
        double price1, price2, price3;
        int quantity1, quantity2, quantity3;
        double subtotal, discount, salestax, finaltotal;
        
        // Input for items 1,2,3
        System.out.print("Enter the price of item 1.     : ");
        price1 = scanner.nextDouble();
        System.out.print("Enter the quantity of item 1.  : ");
        quantity1 = scanner.nextInt();
        
        System.out.print("Enter the price of item 2.     : ");
        price2 = scanner.nextDouble();
        System.out.print("Enter the quantity of item 2.  : ");
        quantity2 = scanner.nextInt();
        
        System.out.print("Enter the price of item 3.     : ");
        price3 = scanner.nextDouble();
        System.out.print("Enter the quantity of item 3.  : ");
        quantity3 = scanner.nextInt();
        
        // Calculations
        subtotal = (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3);
        
        discount = subtotal * 0.05;
        
        salestax = (subtotal - discount) * 0.12;
        
        finaltotal = (subtotal - discount) + salestax;
        
        // Output 
        System.out.println("Subtotal.    : " + "PHP "+ subtotal);
        System.out.println("Discount.    : " + "PHP  " + discount);
        System.out.println("Sales Tax.   : " + "PHP  " + salestax);
        System.out.println("Final Total. : " + "PHP " +finaltotal);
        
        scanner.close();
    }
}