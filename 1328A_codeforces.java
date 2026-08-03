// A. Divisibility Problem
// You are given two positive integers a
//  and b
// . In one move you can increase a
//  by 1
//  (replace a
//  with a+1
// ). Your task is to find the minimum number of moves you need to do in order to make a
//  divisible by b
// . It is possible, that you have to make 0
//  moves, as a
//  is already divisible by b
// . You have to answer t
//  independent test cases.
// Input
// The first line of the input contains one integer t
//  (1≤t≤104
// ) — the number of test cases. Then t
//  test cases follow.
// The only line of the test case contains two integers a
//  and b
//  (1≤a,b≤109
// ).
// Output
// For each test case print the answer — the minimum number of moves you need to do in order to make a
//  divisible by b
// Example
// InputCopy
// 5
// 10 4
// 13 9
// 100 13
// 123 456
// 92 46
// OutputCopy
// 2
// 5
// 4
// 333
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        int j=0;
        int sum=0;
        while(n>0){
            if(a[j]%b[j]!=0){
                sum=b[j]-(a[j]%b[j]);
                System.out.println(sum);
                sum=0;
            }
            else{
                sum=0;
                System.out.println(sum);
            }
            n--;
            j++;
        }
        sc.close();
    }
}

0
