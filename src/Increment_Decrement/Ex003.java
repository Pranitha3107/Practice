package Increment_Decrement;
public class Ex003 {
    public static void main(String[] args) {
        int x=5;
        System.out.println(x++ + ++x);
        /*
        //x++-->A-->ExpA-->5, x=6
//++x-->B-->ExpB-->7, x=7
now x++ + ++x=A+B=5+7=13

         */
    }

}
