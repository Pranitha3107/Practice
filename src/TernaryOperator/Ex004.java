package TernaryOperator;
public class Ex004 {
    public static void main(String[] args) {
        //find the max number between two numbers
        int x = 20;
        int y = 30;
        //System.out.println(Math.min(x,y)); predefind

        //by using ternary we need to do as below
        int max = x < y ? x : y;
        System.out.println(max);

    }
}
