// A. Stones on the Table
// There are n stones on the table in a row, each of them can be red, green or blue. Count the minimum number of stones to take from the table so that any two neighboring stones had different colors. Stones in a row are considered neighboring if there are no other stones between them.
// Input
// The first line contains integer n (1 ≤ n ≤ 50) — the number of stones on the table.
// The next line contains string s, which represents the colors of the stones. We'll consider the stones in the row numbered from 1 to n from left to right. Then the i-th character s equals "R", if the i-th stone is red, "G", if it's green and "B", if it's blue.
// Output
// Print a single integer — the answer to the problem.
// Examples
// InputCopy
// 3
// RRG
// OutputCopy
// 1
// InputCopy
// 5
// RRRRR
// OutputCopy
// 4
// InputCopy
// 4
// BRBG
// OutputCopy
// 0
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String str = sc.next();
        int sum=0;
        for(int i=0;i<n-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
