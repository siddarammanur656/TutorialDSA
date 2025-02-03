package siddarama;

import java.util.Scanner;

public class GreetingMsgforname {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the name : ");

        String name =in.nextLine();

        System.out.println("hello "+name+" how are you?");
    }
}
