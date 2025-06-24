package Task_23rdJUNE;

import java.util.Scanner;

public class Vowel_or_consonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character");
        char ch=sc.next().toLowerCase().charAt(0);

        if (ch == 'a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
            {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("consonant");
        }
    }
}
