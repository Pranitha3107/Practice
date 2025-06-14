package Typecasting;
public class floatcasting {
    public static void main(String[] args) {
        int course=5000;
        float GST=900.62f;
       // int total=course+GST; implicit not possible
        int total=course+(int)GST;//Explicit norrowing
        System.out.println(total);

       //converting float to int there is data loss so we need to choose correct data type

        float total2=course+GST;//implicit, converting int to float so automatically it will
        float total3=(float)course+GST;//Explicit
        System.out.println(total2);
        System.out.println(total3);

    }
}

