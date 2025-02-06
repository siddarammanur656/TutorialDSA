package Methods;

import java.util.Scanner;

public class PythagoreanTripletCheck {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //Asking use input
        System.out.print("Enter the three numbers (a,b,c): ");
        int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();
        //calling Check_PythagoreanTriplet method
        if(Check_PythagoreanTriplet(a,b,c)){
            System.out.println("Given triplet is a Pythagorean triplet..");
        }else{
            System.out.println("Given triplet is not a Pythagorean triplet..");
        }
    }
    //method for checking pythagorean triplet
    public static boolean Check_PythagoreanTriplet(int a, int b, int c){
        return a * a + b * b == c * c;//it returns true or false
    }
}
