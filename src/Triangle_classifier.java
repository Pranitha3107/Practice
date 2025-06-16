import java.util.Scanner;

public class Triangle_classifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input side lengths
        System.out.print("Enter side 1: ");
        int side1 = scanner.nextInt();

        System.out.print("Enter side 2: ");
        int side2 = scanner.nextInt();

        System.out.print("Enter side 3: ");
        int side3 = scanner.nextInt();

        if (side1 == side2 && side2 == side3) {
            System.out.println("The triangle is Equilateral.");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("The triangle is Isosceles.");
        } else {
            System.out.println("The triangle is Scalene.");
        }
/*
if side1=5,side2=6,side3=6
5=6-->False && 6=6-->True
False&&True-->False
5==6-->False||6==6-->True||5==6-->False--->True
else if-->Scalene

 */

    }
}
