package Functions;
public class Ex005 {
    public static void main(String[] args) {
       int result= sum_of_number( 5, 6);
        System.out.println(result);

        sum_of_number1(3, 2);//no return

    }
    static int sum_of_number(int a,int b)
    {
        return a+b;
    }
    static void sum_of_number1(int a,int b)
    {
        System.out.println(a+b);
    }
}
