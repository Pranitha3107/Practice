package For_loop;
public class Ex012 {
    public static void main(String[] args) {
            for (int i = 0; i <= 50; i++) { // 0 to 50, 51 Times
                if (i % 2 == 0) {
                    continue;// means even numbers will not print
                }
                System.out.println("Odd ->" + i);
            }
        }
    }

