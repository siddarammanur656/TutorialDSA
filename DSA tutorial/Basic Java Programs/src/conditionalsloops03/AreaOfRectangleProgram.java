package conditionalsloops03;

import java.util.Scanner;
//3. Area Of Rectangle Program
public class AreaOfRectangleProgram {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("Enter the lenght : ");
        float length =in.nextFloat();

        System.out.println("Enter the widht : ");
        float width=in.nextFloat();

        double area =length*width;
        System.out.println("The area of Rectangle is : "+area);

    }
}
