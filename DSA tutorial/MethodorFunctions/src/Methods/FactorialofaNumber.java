package Methods;

import java.util.Scanner;

public class FactorialofaNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // Asking user input
        System.out.println("Eneter the number : ");
        int num=in.nextInt();
        // displaying result
        System.out.println("Factorial of given number is :"+getfactorial(num));
        System.out.println("Factorial(Recursion) of given number is :"+calculatefactorial(num));
    }
    // normal factorial method
    public static long getfactorial(int num){
        if (num==0 || num==1){
            return 1;
        }
        long f=1;
        for(int i=1; i<=num;i++){
            f=f*i;//multiflying f by i
        }
        return f;
    }
    // Recursive method to calculate factorial og given number
    public static long calculatefactorial(int num){
        if(num==0 || num==1){
            return 1;
        }
        return num*calculatefactorial(num-1);// calling method recursively
    }
}
