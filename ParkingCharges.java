import java.util.Scanner;

public class ParkingCharges {
    public static double calculateCharges(double hoursParked) {
        double totalCharge = 2.00;

        // Additional charge for hours exceeding three
        if (hoursParked > 3) {
            totalCharge += (hoursParked - 3) * 0.50;
        }

        // Maximum charge for any given 24-hour period
        return Math.min(totalCharge, 10.00);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalReceipts = 0.00;

        while (true) {
            try {
                System.out.print("Enter hours parked (or -1 to exit): ");
                double hoursParked = scanner.nextDouble();

                if (hoursParked == -1) {
                    break;
                } else if (hoursParked < 0) {
                    System.out.println("Invalid input. Please enter a non-negative number.");
                    continue;
                }

                double charge = calculateCharges(hoursParked);
                totalReceipts += charge;
                System.out.printf("Customer's charge: $%.2f\n", charge);
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // consume the invalid input
            }
        }

        System.out.printf("Total receipts for yesterday: $%.2f\n", totalReceipts);
        scanner.close();
    }
}
