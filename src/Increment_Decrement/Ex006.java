package Increment_Decrement;
public class Ex006 {
    public static void main(String[] args) {
        int x=5;
        int y = x++ + ++x + x++ + ++x;
        /*
        x++-->A-->ExpA:5-->x=6;
++X-->B-->ExpB:7-->x=7;
x++-->C-->ExpC:7-->x=8;
++X-->D-->ExpD:9-->x=9;
X=9,y=5+7+7+9=28
         */
        System.out.println("x = " + x + ", y = " + y);
    }
}
