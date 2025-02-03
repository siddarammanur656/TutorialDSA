package siddarama;

//5. Take 2 numbers as input and print the largest number.
import java.util.Scanner;

public class largest2num {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Eneter the number1: ");
        int n1=in.nextInt();
        System.out.println("Eneter the number2: ");
        int n2=in.nextInt();

        if (n1>n2){
            System.out.println(n1+" is the largest number in given two numbers!");
        }
        else {
            System.out.println(n2+" is the largest number in given two numbers!");
        }

    }
}
