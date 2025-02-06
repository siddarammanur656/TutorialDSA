package Methods;

import java.util.Scanner;

//Write a function to find if a number is a palindrome or not. Take number as parameter.
public class palindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        //Asking user input String
        System.out.print("enter the string : ");
        String str =in.next();
        System.out.print("enter the Number : ");
        int n=in.nextInt();
        System.out.println(is_palindrome(n));
        //calling check_palindrome method and dispaly the result
        if (check_palindrome(str)) {
            System.out.println("Given String is palindrome..");
        }else {
            System.out.println("Given String is not palindrome..");
        }

    }
    public static boolean check_palindrome(String str){

        // index start starts from 0th index and index end starts from length-1 of given string
        int start=0;
        int end=str.length()-1;

        //while loop iterate until conditon true or false
        while(start<end){
            // it check given string is not palindrome it return  fasle other wise return true
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public  static boolean is_palindrome(int n){
        int temp=n;
        int rev_n=0;
        while(temp>0){
           int rem=temp%10;
           rev_n=rev_n*10+rem;
           temp/=10;
        }
        return n==rev_n;
    }
}
