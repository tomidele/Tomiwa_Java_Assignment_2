import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store the count of salespeople in each salary range
        int[] salaryRanges = new int[9];

        // Input sales amounts for each salesperson
        while (true) {
            System.out.print("Enter weekly sales amount (type 'print' to print table): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("print")) {
                printTable(salaryRanges);
                break;
            }

            try {
                double sales = Double.parseDouble(input);
                if (sales < 0) {
                    System.out.println("Invalid input. Please enter a non-negative number or type 'print' to print table.");
                    continue;
                }

                // Calculate the salary for the current salesperson
                double salary = 200 + (0.09 * sales);

                // Determine the index of the corresponding salary range based on the salary
                int index = (int) ((salary - 200) / 100);

                // Increment the counter at the determined index
                salaryRanges[Math.min(index, 8)]++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or type 'print' to print table.");
            }
        }

        scanner.close();
    }

    public static void printTable(int[] salaryRanges) {
        // Print the results in tabular format
        System.out.println("Salary Range\tNumber of Salespeople");
        System.out.println("-------------------------------------");
        for (int i = 0; i < salaryRanges.length; i++) {
            String range;
            if (i == 8) {
                range = "$1000 and over";
            } else {
                range = String.format("$%d-%d", (i + 2) * 100, (i + 3) * 100 - 1);
            }
            System.out.printf("%-15s\t%d\n", range, salaryRanges[i]);
        }
    }
}
