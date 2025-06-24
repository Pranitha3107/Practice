package Task_23rdJUNE;

import java.util.Scanner;

public class Eligible_for_Vote_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Age");
        int age=sc.nextInt();

        if(age>=18)
        {
            System.out.println("Eligible for Vote");
        }
        else
        {
            System.out.println("Not Eligible");
        }
    }
}
