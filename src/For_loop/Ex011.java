package For_loop;
public class Ex011 {
    public static void main(String[] args) {
        for(int i=0;i<50;i++)
        {
            if (i==5)
            {
                continue;//skip the code move to next, means 5 will be skipped in o/p
            }
            else{
                System.out.println(i);
            }
        }
    }
}
