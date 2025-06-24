package Task_23rdJUNE;

import java.util.Scanner;

public class Find_the_max_of_three_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1=sc.nextInt();

        System.out.println("Enter the second number");
        int number2=sc.nextInt();

        System.out.println("Enter the third number");
        int number3=sc.nextInt();

        if(number1>number2&&number1>number3)
        {
            System.out.println("Number1 is Maximum");
        }
        else if(number2>number3&&number2>number1)
        {
            System.out.println("Number2 is Maximum");
        }
        else
        {
            System.out.println("Number3 is Maximum");
        }
    }
}
