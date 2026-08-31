// B. Seats
// time limit per test1 second
// memory limit per test256 megabytes

// Cordell manages a row of n
//  seats at the Scuola Comunale di Musica Piova where students are strictly forbidden from sitting next to each other.

// You are given a binary string∗
//  s
// , where si=1
//  indicates that the i
// -th seat has been occupied by a student, and si=0
//  indicates that it is free now. It is guaranteed that no two adjacent seats are occupied currently. Cordell needs to add more students until it is impossible to seat anyone else in the row. However, she wants to achieve this state with as few students as possible.

// Your task is to calculate the minimum total number of students seated when it is impossible to seat anyone else in the row.

// ∗
// A binary string is a string where each character is either 0
//  or 1
// .

// Input
// Each test contains multiple test cases. The first line contains the number of test cases t
//  (1≤t≤104
// ). The description of the test cases follows.

// The first line of each test case contains a single integer n
//  (1≤n≤2⋅105
// ) — the number of seats in the row.

// The second line of each test case contains the binary string s
//  of length n
//  (si∈{0,1}
// ). It is guaranteed that no two adjacent characters are both 1
// .

// It is guaranteed that the sum of n
//  over all test cases does not exceed 2⋅105
// .

// Output
// For each test case, output a single integer — the minimum total number of seated students.

// Example
// InputCopy
// 5
// 1
// 0
// 3
// 000
// 5
// 00000
// 6
// 100101
// 13
// 0000100001000
// OutputCopy
// 1
// 1
// 2
// 3
// 5
// Note
// In the first test case, n=1
//  and the hall is initially empty. Because the row is still possible to seat any student, Cordell must place one student at seat 1
// . Therefore, the minimum number of seated students is 1
// .

// In the third test case, Cordell can place two students at seats 1
//  and 4
// . It can be shown that she cannot place only one student so that the row is impossible to seat anyone more, so the answer is 2
// .

// In the fourth test case, no extra students can be seated, so Cordell can place no extra students, and the number of seated students is 3
// .
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
 
        String line = br.readLine();
        if (line == null) return;
        st = new StringTokenizer(line);
        int t = Integer.parseInt(st.nextToken());
 
        StringBuilder sb = new StringBuilder();
 
        while (t-- > 0) {
            while (st == null || !st.hasMoreTokens()) {
                line = br.readLine();
                if (line == null) break;
                st = new StringTokenizer(line);
            }
            int n = Integer.parseInt(st.nextToken());
 
            while (st == null || !st.hasMoreTokens()) {
                line = br.readLine();
                if (line == null) break;
                st = new StringTokenizer(line);
            }
            char[] s = st.nextToken().toCharArray();
 
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (s[i] == '1') {
                    count++;
                }
            }
 
            for (int i = 0; i < n; i++) {
                if (s[i] == '1') continue;
 
                boolean canPlaceLeft = (i == 0 || s[i - 1] != '1');
                boolean canPlaceRight = (i == n - 1 || s[i + 1] != '1');
 
                if (canPlaceLeft && canPlaceRight) {
                    if (i + 1 < n && s[i + 1] != '1' && (i + 2 == n || s[i + 2] != '1')) {
                        s[i + 1] = '1';
                        count++;
                        i++; 
                    } else {
                        s[i] = '1';
                        count++;
                    }
                }
            }
 
            sb.append(count).append("\n");
        }
 
        System.out.print(sb);
    }
}
