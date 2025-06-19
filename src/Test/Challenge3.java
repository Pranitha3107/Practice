package Test;
public class Challenge3 {
    public static void main(String[] args) {

            int a=10;int b=5;

            System.out.println("a == b: " + (a == b));  // false
            System.out.println("a > b: " + (a > b));    // true
            System.out.println("a < b: " + (a < b));    // false
            System.out.println("(a > b) && (a > 0): " + ((a > b) && (a > 0)));  // true
            System.out.println("(a < b) || (a > 0): " + ((a < b) || (a > 0)));  // true
            System.out.println("!(a > b): " + !(a > b));  // false

        }
    }
