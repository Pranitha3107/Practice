package Task_23rdJUNE;

import java.util.Scanner;

public class check_number_is_evenOrodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int var1=sc.nextInt();

        if(var1%2==0)
        {
            System.out.println("The number is Even");
        }
        else
        {
            System.out.println("The number is Odd");
        }
    }
}
