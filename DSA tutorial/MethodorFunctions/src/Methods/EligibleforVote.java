package Methods;

import java.util.Scanner;
//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
public class EligibleforVote {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        //input age
        int age =in.nextInt();
        //calling fuction
        boolean voting=eligibleforvote(age);
        //tells he/she eligible for voting
        if(voting==true){
            System.out.println("He/She are Eligible for voting..");
        }else {
            System.out.println("He/She are Eligible for voting..");
        }

    }
    //method
    public static boolean eligibleforvote(int age ){
        //return boolean values if codition is satisfied
        if (age>=18){
            return true;
        }
        return false;
    }
}
