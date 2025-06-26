package Strings;


public class Challenge2 {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "hello";
        String string3 = "Hello";

        System.out.println("String1: " + string1);
        System.out.println("String2: " + string2);
        System.out.println("String3: " + string3);
        System.out.println("\n--- Comparison Results ---");

        // Using == operator
        System.out.println("string1 == string2: " + (string1 == string2)); // false
        System.out.println("string1 == string3: " + (string1 == string3)); // true (same literal)

        // Using equals()
        System.out.println("string1.equals(string2): " + string1.equals(string2)); // false
        System.out.println("string1.equals(string3): " + string1.equals(string3)); // true

        // Using equalsIgnoreCase()
        System.out.println("string1.equalsIgnoreCase(string2): " + string1.equalsIgnoreCase(string2)); // true
        System.out.println("string1.equalsIgnoreCase(string3): " + string1.equalsIgnoreCase(string3)); // true

        // Using compareTo()
        System.out.println("string1.compareTo(string2): " + string1.compareTo(string2)); // negative
        System.out.println("string1.compareTo(string3): " + string1.compareTo(string3)); // 0

        // Using compareToIgnoreCase()
        System.out.println("string1.compareToIgnoreCase(string2): " + string1.compareToIgnoreCase(string2)); // 0
    }
}
