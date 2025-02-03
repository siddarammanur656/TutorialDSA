package siddarama;
//3. Write a program to input principal, time, and rate (P, T, R) from the user and
//find Simple Interest.
import java.util.Scanner;

public class Ineterest {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Eneter the Principal value : ");
        double P=in.nextDouble();
        System.out.println("Eneter the Time value : ");
        double T=in.nextDouble();
        System.out.println("Eneter the Rate value : ");
        double R=in.nextDouble();

        double ineterest=(P*T*R)/100;

        System.out.println("sample interest : "+ineterest);

    }
}
