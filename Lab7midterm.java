
//Ambales, Geneses L.
//CITCS - 1N 
//Laboratory Challenge No. 7: Password Validation System

import java.util.Scanner;

public class Lab7midterm {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        while (true) {
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            
            if (isValidPassword(password)) {
                System.out.println("Your password is valid!");
                break; 
            } else {
                System.out.println("Password must contain at least 8 characters, including one uppercase letter and one number.");
            }
        }
    }

    
    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

      
        boolean hasUppercase = false;
        boolean hasNumber = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            }
            if (Character.isDigit(c)) {
                hasNumber = true;
            }
        }

        
        return hasUppercase && hasNumber;
    }
}