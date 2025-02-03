package siddarama;

import java.util.Scanner;

//4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
//(Use if conditions)
public class Arithmatic {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the num1: ");
        double num1=in.nextDouble();
        System.out.println("Enter the num2: ");
        double num2=in.nextDouble();
        System.out.println("Enter the operator: ");
        String operator =in.next();

        if (operator.equals("+")){
            double sum=num1+num2;
            System.out.println("Sum of "+num1+" and "+num2+"is : "+sum);
        } else if (operator.equals("-")) {
            double Substract=num1-num2;
            System.out.println("Substract of "+num1+" and "+num2+"is : "+Substract);
        } else if (operator.equals("*")) {
            double multi=num1*num2;
            System.out.println("Multiple of "+num1+" and "+num2+"is : "+multi);
        } else if (operator.equals("/")) {
            if (num2 != 0) {
                double divide=num1/num2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                in.close();
                return;
            }
        }
        else {
            System.out.println("Invalid operator,Please enter valid operator");
        }

    }
}
