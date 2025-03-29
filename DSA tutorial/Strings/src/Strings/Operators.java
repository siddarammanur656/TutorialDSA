package Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+3));

        System.out.println("a"+1);
        //this is same after few steps :"a"+"1"
        //integer will be converted into Integer  (wraper class) that will call .toString() method

        System.out.println("Manur"+new ArrayList<>());
        System.out.println("Manur"+new Integer(56));

        String ans=new Integer(56)+""+new ArrayList<>();
        System.out.println(ans);

        System.out.println("a"+"b");



    }
}
