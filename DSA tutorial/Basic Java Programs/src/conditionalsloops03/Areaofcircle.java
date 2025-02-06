package conditionalsloops03;

import java.util.Scanner;
//### Basic Java Programs
//1. Area Of Circle Java Program
public class Areaofcircle {

    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        System.out.println("Eneter the radious : ");
        float radious=in.nextFloat();

        double area=3.142*radious*radious;
        System.out.println("Area of circle :"+area);


    }
}
