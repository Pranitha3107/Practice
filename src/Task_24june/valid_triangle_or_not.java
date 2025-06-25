package Task_24june;

import java.util.Scanner;

public class valid_triangle_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Side 1");
        int side1=sc.nextInt();

        System.out.println("Enter Side 2");
        int side2=sc.nextInt();

        System.out.println("Enter Side 3");
        int side3=sc.nextInt();

        if(side1<side2+side3&&side2<side1+side3&&side3<side1+side2)
        {
            System.out.println("It is a valid Triangle");
        }
        else{
            System.out.println("It is not a Valida Triangle");
        }
    }
}
