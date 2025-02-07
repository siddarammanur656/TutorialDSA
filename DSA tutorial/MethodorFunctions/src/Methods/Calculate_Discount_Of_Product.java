package Methods;

import java.util.Scanner;

public class Calculate_Discount_Of_Product {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        System.out.println("Enter the price: ");
        int price =in.nextInt();
        System.out.println("Eneter the Discout: ");
        int dis=in.nextInt();

//        double dis_price=price-(price*dis/100.0);
//        System.out.println(dis_price);
        //calling Discout method to calculate Discout
        System.out.println("Discounted Price: " + Discount(price,dis));
    }
    //method to calculate Discout price
    public static double Discount(int price, int dis) {
        return price - (price * dis / 100.0); // Use 100.0 to ensure floating-point division
    }
}
