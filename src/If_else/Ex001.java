package If_else;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        System.out.println("Enter the Age");
        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextInt();

        if (age>=65)
        {
        System.out.println("Senior Citizen");
        }
        else
        {
            System.out.println("Not a Senior Citizen");
        }
    }
}
