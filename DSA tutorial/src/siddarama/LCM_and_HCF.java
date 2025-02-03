package siddarama;

import java.util.Scanner;

public class LCM_and_HCF {

    // Method to calculate HCF using Euclidean Algorithm
    public static int HCF(int n1, int n2) {
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;  // Returning the HCF
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter first number: ");
        int n1 = in.nextInt();

        System.out.print("Enter second number: ");
        int n2 = in.nextInt();

        // Calculating HCF and LCM
        int hcf = HCF(n1, n2);              // Calling the HCF method
        int lcm = (n1 * n2) / hcf;          // Using the formula: LCM = (n1 * n2) / HCF

        // Displaying the results
        System.out.println("HCF("+n1+","+n2+"):"+ hcf);
        System.out.println("LCM("+n1+","+n2+"):"+ lcm);

        in.close();  // Closing the Scanner
    }
}
