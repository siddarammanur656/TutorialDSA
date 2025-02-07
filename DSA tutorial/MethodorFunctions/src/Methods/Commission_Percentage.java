package Methods;

import java.util.Scanner;

public class Commission_Percentage {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        //Asking user input
        double sale_price=in.nextDouble();
        double commision=in.nextDouble();

        //calling commision_percentage
        double com_per=commision_percentage(sale_price,commision);

        // displaying both commision percentage and calling commision method
        System.out.println("commision:  "+commision(sale_price,com_per));
        System.out.println("commision percentage : "+commision_percentage(sale_price,commision));

    }

    //method to claculate commision
    public static double commision(double sale_price ,double com_per){
        double Commision=sale_price*(com_per/100.0);
        return Commision;

    }

    //method to calculate commision percentage
    public static double commision_percentage(double sale_price ,double commision ){
        double commision_per=(commision*100)/sale_price;
        return commision_per;

    }
}
