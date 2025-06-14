package Typecasting;
public class narrowing02 {
    public static void main(String[] args) {
        long phone_number=9966217000l;
       // short s=phone_numer; converting long to short with implicit narrowing is not allowed
        short s=(short)phone_number;//Expicit narrowing is allowed
        System.out.println(s);
    }
}
