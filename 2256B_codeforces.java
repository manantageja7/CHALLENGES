// B. Domino Tiles
// time limit per test1 second
// memory limit per test256 megabytes

// Nygglatho returns from the market with an old box of tiles whose painted marks have begun to fade. Before she can put it away, Chtholly and the young fairies have already spread the tiles across the dining table and turned them into a puzzle.

// There is a row of n
//  tiles. Each tile should be marked with either 0
//  or 1
// . However, some of the marks have faded away.

// The current row is represented by a string s
//  of length n
// . Each character of s
//  is 0
// , 1
// , or ?
// . Chtholly must replace every ?
//  with either 0
//  or 1
// .

// After replacement, for every 1≤i<n
// , the two neighboring tiles si
//  and si+1
//  form a domino of weight (si+si+1)
// . Note that two consecutive dominoes share exactly one tile. The completed row is valid if every two consecutive dominoes have different weights.

// Determine the number of different∗
//  ways to replace all ?
//  characters so that the completed row is valid. Output the answer modulo 998244353
// .

// ∗
// Two ways of replacement are considered different if the resulting strings are different.

// Input
// Each test contains multiple test cases. The first line contains the number of test cases t
//  (1≤t≤104
// ). The description of the test cases follows.

// The first line of each test case contains one integer n
//  (2≤n≤2⋅105
// ) — the number of tiles.

// The second line contains the string s
//  of length n
// , where si=0
// , 1
// , or ?
// .

// It is guaranteed that the sum of n
//  over all test cases does not exceed 2⋅105
// .

// Output
// For each test case, output one integer — the number of valid ways to replace all ?
//  characters, modulo 998244353
// .

// Example
// InputCopy
// 4
// 2
// ??
// 5
// 0?1??
// 5
// 0?0??
// 8
// 00110011
// OutputCopy
// 4
// 2
// 0
// 1
// Note
// In the first test case, there is only one domino, so every completion is valid. The valid completed strings are 00
// , 01
// , 10
// , and 11
// .

// In the second test case, the valid completed strings are 00110
//  and 01100
// .

// In the third test case, there are no valid completed strings.

// In the fourth test case, the only valid completed string is 00110011
import java.util.*;
public class Main {
    static final long MOD = 998244353;
    public static long count(String s, int start) {
        long dp0 = 0;
        long dp1 = 0;
        if (s.charAt(start) == '0' || s.charAt(start) == '?') {
            dp0 = 1;
        }
        if (s.charAt(start) == '1' || s.charAt(start) == '?') {
            dp1 = 1;
        }
        for (int i = start + 2; i < s.length(); i += 2) {
            long newDp0 = 0;
            long newDp1 = 0;
            if (s.charAt(i) == '0' || s.charAt(i) == '?') {
                newDp0 = dp1;
            }
            if (s.charAt(i) == '1' || s.charAt(i) == '?') {
                newDp1 = dp0;
            }
            dp0 = newDp0;
            dp1 = newDp1;
        }
        return (dp0 + dp1) % MOD;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            long evenWays = count(s, 0);
            long oddWays = count(s, 1);
            long answer = (evenWays * oddWays) % MOD;
            System.out.println(answer);
        }
        sc.close();
    }
}
// .
