import java.util.Scanner;
public class Main {
    /*
     * A. Sum
     *
     * You are given three integers a, b, and c.
     * Determine if one of them is the sum of the other two.
     *
     * Print "YES" if:
     * a + b = c
     * OR a + c = b
     * OR b + c = a
     *
     * Otherwise, print "NO".
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a + b == c || a + c == b || b + c == a) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}