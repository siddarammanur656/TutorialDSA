package siddarama;

import java.util.Scanner;

//5. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
public class TakeinputfromuseruntiluserentersXandsumall {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the input : ");
        int sum=0;
        String input;
        while(true){
            input=in.next();

            if (input.equals("x")){
                break;
            }
          sum +=Integer.parseInt(input);
        }
        System.out.println("Sum of all number is :"+sum);
    }
}
