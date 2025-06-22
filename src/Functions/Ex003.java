package Functions;

public class Ex003 {

    public static void main(String[] args) {
        f1();
        int x = return_int();
        System.out.println("Returned int: " + x);

        boolean b = return_boolean();
        System.out.println("Returned boolean: " + b);

        float pi = return_float_pi_value();
        System.out.println("Returned float: " + pi);

        String s=return_string();
        System.out.println("Returned String:" + s);

        long l=return_long();
        System.out.println("Returned Long:" +l);
    }

    static void f1() {
        System.out.println("No Return");
    }

    static int return_int() {
        System.out.println("Return Something");
        return 10;
    }

    static boolean return_boolean() {
        return true;
    }

    static float return_float_pi_value() {
        return 3.14f;
    }
    static String return_string()
    {
        return "Sairam";
    }
    static long return_long()
    {
        return 101;
    }
}
