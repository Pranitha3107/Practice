package Operators;
public class interview {
    public static void main(String[] args) {
        int hanvi_age=5;
        System.out.println(hanvi_age<10||hanvi_age>3);// 5<10||5>3-->true||true-->true
        boolean a=!(hanvi_age>20&&hanvi_age<=5);// hanvi_gae>20=false,hanvi_age<=5=true,false&&true=false,!(false)-->true
        System.out.println(a);//output is true,true
    }
}
