import java.util.Scanner;

public class Lab6midterm {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of students: ");
        int totalStudents = scanner.nextInt();

   
        int presentCount = 0;
        int absentCount = 0;

  
        for (int i = 1; i <= totalStudents; i++) {
            System.out.print("Is student " + i + " present? (Y/N): ");
            char attendance = scanner.next().toUpperCase().charAt(0);

            if (attendance == 'Y') {
                presentCount++;
            } else if (attendance == 'N') {
                absentCount++;
            } else {
                System.out.println("Invalid input. Please enter 'Y' for present or 'N' for absent.");
                i--; 
            }
        }

        // Display the total present and absent counts
        System.out.println("Total present: " + presentCount);
        System.out.println("Total absent: " + absentCount);
    }
}