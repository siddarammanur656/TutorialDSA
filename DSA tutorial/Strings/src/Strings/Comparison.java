package Strings;

public class Comparison {
    public static void main(String[] args) {
        // String literals are stored in the string pool.
        String a = "Manur";
        String b = "Manur";
        String c = a;  // c is assigned the reference of 'a'

        // Comparison using '==' (checks reference equality, not content)
        System.out.println(c == a);  // true → 'c' and 'a' refer to the same object in the string pool
        System.out.println(a == b);  // true → Both 'a' and 'b' refer to the same string literal in the string pool

        // Creating strings using 'new' keyword (stored in the heap, not the string pool)
        String name1 = new String("Manur");
        String name2 = new String("Manur");

        System.out.println(name1 == name2);  // false → 'name1' and 'name2' are different objects in the heap
        System.out.println(name1.equals(name2));  // true → 'equals()' checks content, and both strings have the same content
    }
}
