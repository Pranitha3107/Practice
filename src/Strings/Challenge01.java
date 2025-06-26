package Strings;

import java.util.Scanner;

public class Challenge01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // 1. Input two strings
        System.out.print("Enter first String: ");
        String S1 = sc.nextLine();

        System.out.print("Enter Second String: ");
        String S2 = sc.nextLine();

        // 2. Concatenation
        String S = S1 + " " + S2;
        System.out.println("Full String: " + S);

        // 3. Length
        int length = S.length();
        System.out.println("Length of Full String: " + length);

        // 4. Substring
        if (length >= 4) {
            String sub = S.substring(0, 4); // first 4 characters
            System.out.println("Substring (0 to 3): " + sub);
        } else {
            System.out.println("Full name is too short for a substring(0,4).");
        }

        // 5. Character extraction
        if (length > 0) {
            char firstChar = S.charAt(0);
            System.out.println("First character: " + firstChar);
        }


    }
}
