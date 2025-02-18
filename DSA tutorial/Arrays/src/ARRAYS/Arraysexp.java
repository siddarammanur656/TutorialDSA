package ARRAYS;
// 1D ARRAYS
import java.util.Arrays;
import java.util.Scanner;

public class Arraysexp {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
      // int [] arr =new int[5];
//        System.out.println(arr[0]);
//        int [] arr={5,3,6,7,1,8};// initialized array
//        System.out.println(arr[4]);//getting element using index number

//        String [] arr1= new String[5];
//        System.out.println(arr1[0]);

        // input 1st way
//        int [] arr =new int[5];
//        arr[0]=23;
//        arr[1]=24;
//        arr[2]=25;
//        arr[3]=26;
//        arr[4]=27;
//        System.out.println(arr[4]);

        //input using for loop 2nd way
//        int [] arr =new int[5];
//        System.out.println("Enter the Array Element : ");
//        for (int i = 0; i < 5; i++) {
//            arr[i]=in.nextInt();
//        }

        //display the array element 1st way
//        for (int j = 0; j < 5; j++) {
//            System.out.print(arr[j]+" ");
//        }

        //display the array element 2nd way
//      System.out.println(Arrays.toString(arr));
        //display the array element 3nd way
//        for (int num:arr){
//            System.out.print(num+" ");
//        }

        // Array of Object
//        System.out.print("Enter the String Element: ");
//        String [] str = new String[4];
//        for (int i = 0; i <str.length ; i++) {
//            str[i]=in.next();
//        }
//        System.out.println(Arrays.toString(str));

        // passing in function
        int [] num = {3,4,5,12};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));

    }
    static void change(int [] arr){
        arr[0]=999;
    }
}
