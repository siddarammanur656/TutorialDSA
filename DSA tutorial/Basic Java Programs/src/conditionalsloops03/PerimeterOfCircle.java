package conditionalsloops03;

import java.util.Scanner;

//8. Perimeter Of Circle
public class PerimeterOfCircle {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        System.out.println("Eneter the radious : ");
        float radious=in.nextFloat();

        double Perimeter_Of_Circle=2*3.142*radious;
        System.out.println("Perimeter Of Circle :"+Perimeter_Of_Circle);


    }
}
