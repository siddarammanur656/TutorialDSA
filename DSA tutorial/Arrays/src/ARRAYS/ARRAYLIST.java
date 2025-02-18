package ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ARRAYLIST {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //declaration and initialization
//        ArrayList<Integer> list=new ArrayList<>();
        //input
//        list.add(20);
//        list.add(21);
//        System.out.println(list);

//        ArrayList<Integer> list = new ArrayList<>();
//        // Asking user input
//        System.out.print("Enter the element: " );
//        for (int i = 0; i < 5; i++) {
//            list.add(in.nextInt());
//        }
//        System.out.println(list);


        //multilist
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //initialiization
        for (int i = 0; i <3 ; i++) {
            list.add(new ArrayList<>());
        }
        //add element
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
