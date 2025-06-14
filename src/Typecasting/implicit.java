package Typecasting;
public class implicit {
    public static void main(String[] args) {
        byte b=5;
        int a=b;//Widening implicit casting , means small datatype to big data type so automatically JVM will do
        System.out.println(a);
    }
}
