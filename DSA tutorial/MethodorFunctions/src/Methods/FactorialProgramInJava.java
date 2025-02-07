package Methods;

import java.util.Scanner;

public class FactorialProgramInJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Asking user input
        System.out.println("Enter the number : ");
        int n=in.nextInt();

//        int fact=1;
//        for (int i = 1; i <=n; i++) {
//            fact=fact*i;
//        }
//        System.out.println(fact);

        //calling Factorial method to find the factorial number of given number
        System.out.println(Factorial(n));
        //Recursively finding Factorial number
        System.out.println("Recursive Factorial: "+RecursiveFactorial(n));
    }
    //methood to find the factorial number
    static int Factorial(int n){
        int fact=1;
        for (int i = 1; i <= n; i++) {
            fact=fact*i;
        }
        return fact;
    }
    static int RecursiveFactorial(int n){
        if (n == 0 || n == 1) { // Base case to stop recursion
            return 1;
        }
        return n * RecursiveFactorial(n - 1); // Recursive call
    }

}
