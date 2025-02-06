package Methods;

import java.util.Scanner;

//Define a method that returns the product of two numbers entered by user.
public class ProductofTwoNumbers {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //taking input for two numbers
        int a=in.nextInt();
        int b=in.nextInt();
        //calling method and printing result
        System.out.println("Product of Two Numbers is : "+product(a,b));
    }

    public static int product(int a,int b){
        //product of two number
        int product=a*b;
        return product;
    }
}
