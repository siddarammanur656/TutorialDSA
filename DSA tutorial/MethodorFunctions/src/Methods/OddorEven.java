package Methods;

import java.util.Scanner;
//Define a program to find out whether a given number is even or odd.
public class OddorEven {
    public static void main(String[] args) {
        Scanner  in =new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num=in.nextInt();

        System.out.println("The given number is: "+OddEven(num));
    }
    public static String OddEven(int num){

        if (num%2==0){
            return "Even";
        }
        return "Odd";
    }

}
