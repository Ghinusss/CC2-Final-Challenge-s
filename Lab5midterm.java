//Ambales, Geneses L.
//CITCS - 1N 
//Laboratory Challenge No. 5: Restaurant Order System


import java.util.Scanner;

public class Lab5midterm{
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Declare variables for total bill and menu selection
        double total = 0;
        int menu;
        
        // Display the menu
        while (true) {
            System.out.println("MENU");
            System.out.println("1. Burger    - PHP 100");
            System.out.println("2. Fries     - PHP 50");
            System.out.println("3. Soda      - PHP 30");
            System.out.println("4. Ice Cream - PHP 45");
            System.out.println("5. Exit");
            System.out.print("Enter the menu number of your choice: ");
            menu = scanner.nextInt();
            
            // Exit the program if the user selects option 5
            if (menu == 5) {
                break;
            }

            // Get quantity for the selected item
            System.out.print("Enter the quantity: ");
            int quantity = scanner.nextInt();
            
            // Switch statement to calculate the total cost based on the item selected
            switch (menu) {
                case 1:
                    total += 100 * quantity;
                    break;
                case 2:
                    total += 50 * quantity;
                    break;
                case 3:
                    total += 30 * quantity;
                    break;
                case 4:
                    total += 45 * quantity;
                    break;
                default:
                    System.out.println("Invalid selection. Please choose a valid menu number.");
                    continue; // Skip the rest of the loop if the selection is invalid
            }
        }

        // Display the final total bill
        System.out.println("Total amount: PHP " + total);
    }
}