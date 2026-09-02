import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();

            /*
             * We need:
             * a + b = n
             * a > b
             * a > 0 and b > 0
             *
             * Since a = n - b:
             * n - b > b
             * n > 2b
             *
             * Therefore, the number of valid values of b is:
             * (n - 1) / 2
             *
             * For n <= 2, no valid distribution is possible.
             */

            if (n <= 2) {
                System.out.println(0);
            } else {
                System.out.println((n - 1) / 2);
            }
        }

        sc.close();
    }
}