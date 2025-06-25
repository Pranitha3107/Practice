package Task_24june;

import java.util.Scanner;

public class Calculate_grade_basedon_marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks");

        int marks=sc.nextInt();

       /* Grading Criteria:
        100-91=A
         90-81= B
          80-71=C
          70-61=D
          60-50=E
          >50=F
       */
        if(marks<=100&&marks>91)
        {
            System.out.println("A");
        }
        else if(marks<=90&&marks>81)
        {
            System.out.println("B");

        }
        else if(marks<=80&&marks>71)
        {
            System.out.println("C");

        }
        else if(marks<=70&&marks>61)
        {
            System.out.println("D");

        }
        else if(marks<=60&&marks>51)
        {
            System.out.println("E");

        }
        else
        {
            System.out.println("F");
        }
    }

    public static class Money_withdrawn_ATM {
        public static void main(String[] args) {
            int balance=100000;
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter the amount");
            int amount=sc.nextInt();

            //Conditions

            if(amount<0)
            {
                System.out.println("Amount should be greater than 0");
            }
            else if(amount%100!=0)
            {
                System.out.println("Amount must be multiples of 100");
            }
            else if(amount>balance)
            {
                System.out.println("Im Sufficiant Balance");
            }
            else
            {
                balance-=amount;//duduct amount
            }
            System.out.println("Withdrawn Sccessfull");
            System.out.println("Remaining Balance:"+balance);
        }
    }
}
