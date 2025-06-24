package Task_23rdJUNE;

import java.util.Scanner;

public class Find_max_two_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int fn=sc.nextInt();

        System.out.println("Enter second number");
        int scn=sc.nextInt();

        if(fn>scn)
        {
            System.out.println("First Number is max number");
        }
        else
        {
            System.out.println("Second number is maximum");
        }
    }
}
