package Strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name="Siddarama mallanna manur hello world";
        System.out.println(name);
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('m'));
        System.out.println(name.strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
