package Typecasting;
public class narrowing01 {
    public static void main(String[] args) {
        int a=300;
        //byte b=a; will not allow implicit, narrowing int -->byte  not allow implicit casting
        byte b=(byte)a;//we need to mention explicit datatype, data loss
        /*
        Binary of 300 = 100101100
byte means only last 8 digits so 00101100
0 × 2⁷ =   0
0 × 2⁶ =   0
1 × 2⁵ =  32
0 × 2⁴ =   0
1 × 2³ =   8
1 × 2² =   4
0 × 2¹ =   0
0 × 2⁰ =   0
Now add the results:

32 + 8 + 4 = 44

✅ Answer: 00101100 in decimal is 44.

         */
        System.out.println(b);
    }
}
