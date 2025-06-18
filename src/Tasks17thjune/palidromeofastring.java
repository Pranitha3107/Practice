package Tasks17thjune;
import java.util.Scanner;
public class palidromeofastring {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String reversed = "";
        // Reverse string using charAt()

        for (int i=str.length()-1;i>=0;i--){
            reversed=reversed+str.charAt(i);
        }
        // Check if original equals reversed
if (str.equals(reversed)) {
    System.out.println(str + " is a Palindrome.");
} else {
    System.out.println(str + " is NOT a Palindrome.");
}

    }
}
