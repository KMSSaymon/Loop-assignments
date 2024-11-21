import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the side length
        System.out.print("Enter the side length: ");
        int sideLength = scanner.nextInt();

        // Print the upper part of the diamond
        for (int i = 1; i <= sideLength; i++) {
            // Print spaces
            for (int j = 1; j <= sideLength - i; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print the lower part of the diamond
        for (int i = sideLength - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= sideLength - i; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
