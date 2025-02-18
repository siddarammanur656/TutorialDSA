package Methods;

import java.util.Scanner;

public class Calculate_CGPA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        double sum=0;
        for (int i = 1; i <=n ; i++) {
            System.out.print("enter the SGPA "+(i+1)+" : ");
            sum+=in.nextDouble();
        }
        double cgpa=sum/n;
        System.out.println("The CGPA is : "+cgpa);
    }
}
