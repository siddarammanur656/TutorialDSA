package Methods;

import java.util.Scanner;

public class CalculateElectricityBill {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        //Asking user input how much unit is consumed in your house or other
        System.out.print("Enter the total units consumed: ");
        double  units =in.nextDouble();
        //total bill
//        double bill=0;
//        //conditional statement
//        if (units <= 100) {
//            bill = units * 1.5;//if unit is less than 100, per unit cast is 1.5 rupees
//        }
//        else if (units <= 300) {
//            bill = 100 * 1.5 + (units - 100) * 2.5; //if unit is less than 300, per unit cast is 2.5 rupees
//        }
//        else{
//            bill = 100 * 1.5 + 200 * 2.5 + (units - 300) * 3.5;//if unit is gretter than 300,per unit cast is 3.5 rupees
//        }
//        System.out.println("The Electricity bill is :"+bill);
        //calling function
        System.out.println("The Electricity bill is :"+ElectricityBill(units));
    }
    static double ElectricityBill(double units){
        double bill=0;
        if (units <= 100) {
            bill = units * 1.5;//if unit is less than 100, per unit cast is 1.5 rupees
        }
        else if (units <= 300) {
            bill = 100 * 1.5 + (units - 100) * 2.5; //if unit is less than 300, per unit cast is 2.5 rupees
        }
        else{
            bill = 100 * 1.5 + 200 * 2.5 + (units - 300) * 3.5;//if unit is gretter than 300,per unit cast is 3.5 rupees
        }
        return bill;
    }
}
