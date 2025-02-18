package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class ARRAY2Darray {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        /*
         {
          {1,2,3},
          {4,5,6},
          {7,8,9}
         }
        */
        //declaration and initialization of 2d array
//        int [] [] arr=new int[5][];//here number of row should be mention but column may very
//        System.out.println(Arrays.toString(arr));

        //2D Array input
        int [] [] arr=new int[3][3];
        System.out.println("The 2D Array length is : "+arr.length);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]=in.nextInt();
            }
        }
        //display
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        // 2D Array Display elemnts
//        System.out.println("Array Element is : ");
//        System.out.println(Arrays.deepToString(arr));

        // 2d array display
        for (int [] num: arr){
            System.out.println(Arrays.toString(num));
        }
    }
}
