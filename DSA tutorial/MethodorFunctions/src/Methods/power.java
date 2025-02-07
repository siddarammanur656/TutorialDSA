package Methods;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Asking input from user
        System.out.print("Enter the Base Value:");
        int base=in.nextInt();
        System.out.print("Enter the Exponent Value: ");
        int exponent=in.nextInt();
        //calling Power method to calculate the power using base and exponent values
        System.out.println(Power(base,exponent));
    }
    //method to calculate power
    public static double Power(int base ,int exponent){
        double result=Math.pow(base,exponent);
        return result;
    }
}
