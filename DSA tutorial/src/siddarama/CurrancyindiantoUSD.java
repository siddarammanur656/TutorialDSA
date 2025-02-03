package siddarama;
//6. Input currency in rupees and output in USD.
import java.util.Scanner;
public class CurrancyindiantoUSD {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("Eneter the Indian Rupees: ");
        double rupees=in.nextDouble();
        double conversionRate = 0.012; // 1 INR = 0.012 USD
        double USD=rupees*0.011;
        System.out.println("The conversion of Indian rupees to USD is : "+USD);

        System.out.println("Eneter the US dollar : ");
        double dollar=in.nextDouble();
        double conversionrate =87.15;
        double Rupees=dollar*87.15;
        System.out.println("The conversion of US Dollar to Rupees is : "+Rupees);
    }
}
