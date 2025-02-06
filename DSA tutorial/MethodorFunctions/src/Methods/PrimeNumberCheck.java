package Methods;
//Define a method to find out if a number is prime or not.
import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        //input number
        System.out.println("Enter the number : ");
        int num=in.nextInt();

        //calling method
        if(check_prime(num)){
            System.out.println(num+" is prime");
        }else {
            System.out.println(num+" is not prime");
        }
    }

    //method
    public static boolean check_prime(int num){

        //if input is equals to one or less than one it returns  boolean value false (is not prime)
        if (num <= 1) {
            return false;
        }
       //while loop used it checks the number is prime or not and returns boolean values
//        int i=2;
//        while (i*i<=num){
//            if (num%i==0){
//                return false;
//            }
//            i++;
//        }
//        return true;
        for (int i = 2; i*i <num; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
