package Increment_Decrement;
public class Ex002 {
    public static void main(String[] args) {
        int i=1;
        System.out.println(i++ + ++i);
        /*
        //first  i value =1
i++=2
++i=2+1=3
now i=1+3=4
//i++->A->ExpA->1, i=2
//++i-->B-->ExpB->3, i=3
now i=1+3=4

         */
    }
}
