package conditionalsloops03;
//7. Area Of Equilateral Triangle
import java.util.Scanner;

public class AreaOfEquilateralTriangle {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("Eneter the side : ");
        double side  =in.nextDouble();

        double area=((Math.sqrt(3))*side*side)/4;
        System.out.println("The Area of  Equilateral Triangle is : "+area);

    }
}
