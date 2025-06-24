package Task_23rdJUNE;

import java.util.Scanner;

public class Smallest_of_two_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1=sc.nextInt();

        System.out.println("Enter the second number");
        int number2=sc.nextInt();

        if(number1<number2)
        {
            System.out.println("Number1 is Samll");
        }
        else
        {
            System.out.println("Number2 is Samll");
        }
    }
}
