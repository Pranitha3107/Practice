package Increment_Decrement;
public class Ex005 {
    public static void main(String[] args) {
        int a = 5;

        int b = a++ + ++a;
       // a++->A-->ExpA:5--> a=6;
        //++a-->B-->ExpB:7--> a=7
        //b=ExpA+AepB=5+7=12

        System.out.println("a: " + a); // Output:7

        System.out.println("b: " + b); // Output:


    }
}
