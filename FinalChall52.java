import java.util.Scanner;

// Custom Exception for Invalid Quantity
class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String message) {
        super(message);
    }
}

class ShoppingCart {
    private int stock;

    // Constructor to initialize stock
    public ShoppingCart(int stock) {
        this.stock = stock;
    }

    // Method to add items to the cart
    public void addToCart(int quantity) throws InvalidQuantityException {
        if (quantity < 0) {
            throw new InvalidQuantityException("Quantity cannot be negative!");
        }
        if (quantity > stock) {
            throw new InvalidQuantityException("Only " + stock + " items are available in stock!");
        }
        stock -= quantity;
        System.out.println("Added " + quantity + " items to your cart. Remaining stock: " + stock);
    }
}

public class FinalChall52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart(50); // 50 items in stock

        // Prompt user to input the quantity
        System.out.print("Enter quantity to add to cart: ");
        int quantity = scanner.nextInt();

        try {
            cart.addToCart(quantity);  // Try to add items to the cart
        } catch (InvalidQuantityException e) {
            System.out.println(e.getMessage());  // Catch and display the exception message
        } finally {
            scanner.close();
        }
    }
}