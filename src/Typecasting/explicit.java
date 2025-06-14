package Typecasting;
public class explicit {
    public static void main(String[] args) {
        byte a=10;
        int b=a;//implicit
        int a1=(int)b;//Explicit , Small to big so need to mention int actually
        System.out.println(a1);
    }
}
