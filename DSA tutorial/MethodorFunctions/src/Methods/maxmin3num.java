package Methods;

import java.util.Scanner;
//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public class maxmin3num {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        System.out.println("The maximum number of  given three numbers is :"+maxnum(a,b,c));
        System.out.println("The minmum number of  given three numbers is :"+minnum(a,b,c));
    }
    public static int maxnum(int a, int b, int c){
        int max=0;
        if(a>b){
            max=a;
        }else {
            max=b;
        }
        if (c>max){
            max=c;
        }
        return max;
    }
    public static int minnum(int a, int b, int c){
        int min=0;
        if(a<b){
            min=a;
        }else {
            min=b;
        }
        if (c<min){
            min=c;
        }
        return min;
    }
}
