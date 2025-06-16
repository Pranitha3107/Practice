package TernaryOperator;
public class Ex007_Find_max_number {
    public static void main(String[] args) {
        int a=5;
        int b=8;
        int c=-16;
        //if a>b and a>c -->a is max
        // if b>a and b>c-->b is max
        // if a and b are false then c is max
        //int max=(a>b)?A:B;
        //A->a>c?a:c
        //B->b>c?b:c

        int max=(a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println(max);
    }
}
