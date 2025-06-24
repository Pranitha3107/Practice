package Task_23rdJUNE;

import java.util.Scanner;

public class check_number_positiveorNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int var1=sc.nextInt();

        if(var1>0)
        {
            System.out.println("Nuber is Positive");
        }
        else
        {
            System.out.println("Number is Negative");
        }
    }
}
