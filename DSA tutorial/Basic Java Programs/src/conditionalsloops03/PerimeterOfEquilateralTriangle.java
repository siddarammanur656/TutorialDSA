package conditionalsloops03;

import java.util.Scanner;
//9. Perimeter Of Equilateral Triangle
public class PerimeterOfEquilateralTriangle {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("Eneter the side : ");
        double side  =in.nextDouble();

        double Perimeter_Of_Equilateral_Triangle=3*side;//P=3a
        System.out.println("The Perimeter Of Equilateral Triangle is : "+Perimeter_Of_Equilateral_Triangle);

    }
}
