import java.util.Scanner;
public class matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the 2D matrix from user
        System.out.print("Enter the size of the 2D matrix (n): ");
        int n = scanner.nextInt();

        // Initialize a matrix and directly generate patterns without filling numbers
        System.out.println("\nDiagonal Pattern:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print("  * ");
                } else {
                    System.out.print("  0 "); // Replace with 0 or blank spaces for unused cells
                }
            }
            System.out.println();
        }

        // Create and display left-hand side triangle pattern
        System.out.println("\nLeft-hand Side Triangle Pattern:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    System.out.print("  * ");
                } else {
                    System.out.print("  0 "); // Replace with 0 or blank spaces for unused cells
                }
            }
            System.out.println();
        }

        // Create and display top-right triangle pattern
        System.out.println("\nTop-right Triangle Pattern:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j) {
                    System.out.print("  * ");
                } else {
                    System.out.print("  0 "); // Replace with 0 or blank spaces for unused cells
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
