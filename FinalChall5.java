//Ambales, Geneses L.
//CITCS - 1N 
//Final Challenge No. 5: Exception Handling Laboratory Challenges

class NoSeatsAvailableException extends Exception {
    public NoSeatsAvailableException(String message) {
        super(message);
    }
}

public class FinalChall5 {
    public static void main(String[] args) {
        int seatsAvailable = 2; // Total seats available
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Welcome to the Flight Booking System.");
        System.out.println("Seats available: " + seatsAvailable);

        while (seatsAvailable > 0) {
            System.out.print("Do you want to book a seat? (yes/no): ");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("no")) {
                break;
            }

            try {
                if (seatsAvailable == 0) {
                    throw new NoSeatsAvailableException("Error: No seats available.");
                }

                seatsAvailable--;
                System.out.println("Seat booked! Seats remaining: " + seatsAvailable);

            } catch (NoSeatsAvailableException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Thank you for using the Flight Booking System.");
    }
}