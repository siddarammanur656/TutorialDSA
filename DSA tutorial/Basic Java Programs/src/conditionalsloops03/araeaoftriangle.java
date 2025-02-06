package conditionalsloops03;

import java.util.Scanner;
//2. Area Of Triangle
public class araeaoftriangle {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("Eneter the base : ");
        double base =in.nextDouble();

        System.out.println("Enter the Height : ");
        double height =in.nextDouble();

        double area=0.5*base*height;
        System.out.println("The Area of Triangle is : "+area);

    }
}
