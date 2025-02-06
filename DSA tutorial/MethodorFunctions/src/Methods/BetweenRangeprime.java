package Methods;
import java.util.Scanner;

public class BetweenRangeprime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the range
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        // Outer loop to iterate through numbers in the given range
        for (int num = start; num <= end; num++) {
            if (num < 2) continue; // Skip numbers less than 2

            boolean isPrime = true;

            // Inner loop to check if the number is prime
            for (int i = 2; i*i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // Exit loop if a factor is found
                }
            }

            // Print the number if it is prime
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        scanner.close();
    }
}
