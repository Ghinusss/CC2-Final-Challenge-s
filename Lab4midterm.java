import java.util.Scanner;

public class Lab4midterm {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total purchase amount: PHP ");
        double totalAmount = scanner.nextDouble();

    
        double discount = 0;
        double finalPrice;

        if (totalAmount >= 1000 && totalAmount <= 5000) {
            discount = 5;
        } else if (totalAmount > 5000 && totalAmount <= 10000) {
            discount = 10;
        } else if (totalAmount > 10000) {
            discount = 15;
        }

       
        finalPrice = totalAmount - (totalAmount * discount / 100);

       
        System.out.println("Discount applied: " + discount + "%");
        System.out.println("Final price after discount: PHP " + finalPrice);
    }
}