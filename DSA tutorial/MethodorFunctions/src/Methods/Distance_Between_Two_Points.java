package Methods;

import java.util.Scanner;

public class Distance_Between_Two_Points {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Asking user  input
        System.out.println("Enter the x1 and x2 values: ");
        int x1=in.nextInt();
        int x2=in.nextInt();
        System.out.println("Enter the y1 and y2 values: ");
        int y1=in.nextInt();
        int y2=in.nextInt();
        //calling method Distance
        System.out.println("The Distance between two points is : "+Distance(x1,x2,y1,y2));
    }
    //method to calculate distance between two points
    public static double Distance(int x1,int x2,int y1,int y2){
        double dis=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return dis;//returns the distance between two points
    }
}
