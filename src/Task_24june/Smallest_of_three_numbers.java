package Task_24june;

import java.util.Scanner;

public class Smallest_of_three_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=sc.nextInt();

        System.out.println("Enter the second number");
        int num2=sc.nextInt();

        System.out.println("Enter the third number");
        int num3=sc.nextInt();

        if(num1<num2&&num1<num3)
        {
            System.out.println("Number1 is Small");
        }
        else if(num2<num3&&num2<num3)
        {
            System.out.println("Number2 is Small");
        }
        else
        {
            System.out.println("Number3 is small");
        }
    }
}
