package siddarama;
//1. Write a program to print whether a number is even or odd, also take
//input from the user.
import java.util.Scanner;

public class EvenorOdd {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the number: ");

        int num=in.nextInt();

        if (num%2==0){
            System.out.println(num+" is even");

        }else {
            System.out.println(num + " is odd");
        }
    }
}
