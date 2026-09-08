// A. Restoring Three Numbers
// time limit per test1 second
// memory limit per test256 megabytes
// Polycarp has guessed three positive integers a
// , b
//  and c
// . He keeps these numbers in secret, but he writes down four numbers on a board in arbitrary order — their pairwise sums (three numbers) and sum of all three numbers (one number). So, there are four numbers on a board in random order: a+b
// , a+c
// , b+c
//  and a+b+c
// .

// You have to guess three numbers a
// , b
//  and c
//  using given numbers. Print three guessed integers in any order.

// Pay attention that some given numbers a
// , b
//  and c
//  can be equal (it is also possible that a=b=c
// ).

// Input
// The only line of the input contains four positive integers x1,x2,x3,x4
//  (2≤xi≤109
// ) — numbers written on a board in random order. It is guaranteed that the answer exists for the given number x1,x2,x3,x4
// .

// Output
// Print such positive integers a
// , b
//  and c
//  that four numbers written on a board are values a+b
// , a+c
// , b+c
//  and a+b+c
//  written in some order. Print a
// , b
//  and c
//  in any order. If there are several answers, you can print any. It is guaranteed that the answer exists.

// Examples
// InputCopy
// 3 6 5 4
// OutputCopy
// 2 1 3
// InputCopy
// 40 40 40 60
// OutputCopy
// 20 20 20
// InputCopy
// 201 101 101 200
// OutputCopy
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        int x3=sc.nextInt();
        int x4=sc.nextInt();
        int max=0;
        int a,b,c;
        if(x1>x2&&x1>x3&&x1>x4){
            a=x1-x2;
            b=x1-x3;
            c=x1-x4;
        }
        else if(x2>x1&&x2>x3&&x2>x4){
            a=x2-x1;
            b=x2-x3;
            c=x2-x4;
        }
        else if(x3>x2&&x3>x1&&x3>x4){
            a=x3-x2;
            b=x3-x1;
            c=x3-x4;
        }
        else{
            a=x4-x2;
            b=x4-x3;
            c=x4-x1;
        }
        System.out.println(a+" "+b+ " "+c);
    }
}
// 1 100 100
