package If_else;

import java.util.Scanner;

public class vowel_Ex002 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Character:");
        char ch = scanner.next().charAt(0);
        ch=Character.toLowerCase(ch);

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println("It is a character");
        }else{
            System.out.println("It is a consonant");

        }
    }
}