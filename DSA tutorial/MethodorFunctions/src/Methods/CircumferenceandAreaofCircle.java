package Methods;
//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
import java.util.Scanner;

public class CircumferenceandAreaofCircle {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        //input for radious
        System.out.println("Enter the radious: ");
        double rad =in.nextDouble();
        //calling methods
        System.out.println("The circumference of circle: "+circumference(rad));
        System.out.println("The Area of circle: "+Area(rad));
    }
    //method
    public static double circumference(double rad){
        // calculate circumference
        double circumference_circle=2*Math.PI*rad;
        return circumference_circle;
    }
    //method
    public static double Area(double rad){
        //calculate area
        double Area_circle=Math.PI*rad*rad;
        return Area_circle;
    }
}
