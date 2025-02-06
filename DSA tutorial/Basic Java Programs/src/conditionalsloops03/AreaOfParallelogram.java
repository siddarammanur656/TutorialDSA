package conditionalsloops03;
import java.util.Scanner;
//5. Area Of Parallelogram
public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("Eneter the base : ");
        double base =in.nextDouble();

        System.out.println("Enter the Height : ");
        double height =in.nextDouble();

        double area=base*height;
        System.out.println("The Area of Parallelogram is : "+area);

    }
}
