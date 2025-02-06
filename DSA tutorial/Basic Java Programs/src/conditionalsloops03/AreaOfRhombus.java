package conditionalsloops03;
//6. Area Of Rhombus
import java.util.Scanner;

public class AreaOfRhombus {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("Eneter the diagonal d1 : ");
        double d1 =in.nextDouble();

        System.out.println("Enter the diagonal d2 : ");
        double d2 =in.nextDouble();

        double Arearombus=0.5*d1*d2;
        System.out.println("The Area of Rombus is : "+Arearombus);

    }
}
