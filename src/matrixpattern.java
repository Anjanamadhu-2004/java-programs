import java.util.Scanner;

public class matrixpattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the 2D matrix from user
        System.out.print("Enter the size of the 2D matrix (n): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        // Initialize and print the original 2D matrix with numbers
        System.out.println("\nOriginal 2D Matrix:");
        int counter = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = counter++;
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }

        // Create and display diagonal pattern
        System.out.println("\nDiagonal Pattern:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print("  * ");
                } else {
                    System.out.printf("%3d", matrix[i][j]);
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
                    System.out.printf("%3d", matrix[i][j]);
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
                    System.out.printf("%3d", matrix[i][j]);
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
