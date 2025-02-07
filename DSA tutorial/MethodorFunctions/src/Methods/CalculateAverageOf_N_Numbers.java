package Methods;

import java.util.Scanner;

public class CalculateAverageOf_N_Numbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //Asking user input number
        System.out.println("Enter the number : ");
        int n=in.nextInt();
//        int sum=0;
//        for (int i = 1; i <=n ; i++) {
//            sum+=i;
//        }
//        double Avg=sum/n;
//        System.out.println("The Average of given N numbers : "+Avg);
        //calling method to calculate the Average of given N numbers
          System.out.println("The Average of given N numbers : "+Averagenum(5));
    }
    //method for Average of given N numbers
    static double Averagenum(int n){
        double sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum/n;
    }
}
