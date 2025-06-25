package Task_24june;

import java.util.Scanner;

public class Check_character_is_anAlphabet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Character");

        char ch=sc.next().toLowerCase().charAt(0);
        //if(Character.isLetter(ch))-->We can use this function also
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            {
            System.out.println("Alphabet");
        }
        else
        {
            System.out.println("not an Alphabet");
        }
    }
}
