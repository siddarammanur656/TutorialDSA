package conditionalsloops03;

import java.util.Scanner;

//4. Area Of Isosceles Triangle
public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("Eneter the base : ");
        double base =in.nextDouble();

        System.out.println("Enter the Height : ");
        double height =in.nextDouble();

        double area=0.5*base*height;
        System.out.println("The Area of Isosceles Triangle is : "+area);

    }

}
