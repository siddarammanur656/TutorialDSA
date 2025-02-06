package Methods;

import java.util.Scanner;
//Write a program to print the sum of two numbers entered by user by defining your own method.
public class SumofTwoNumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //input for two numbers
        int a=in.nextInt();
        int b=in.nextInt();
        //calling sum method and printing result
        System.out.println("Sum of two numbers is : "+sum(a,b));
    }
    //method
    public static int sum(int a, int b){
        //sum of two number
        int sum=a+b;
        return sum;
    }
}
