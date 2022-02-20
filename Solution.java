/*
Date: 20/feb/2021 sunday
Complete the function solveMeFirst to compute the sum of two integers.
Example 
 a=7
 b=3
Return 10.
Function Description
Complete the solveMeFirst function in the editor below.
solveMeFirst has the following parameters:
int a: the first value
int b: the second value
Returns 
- int: the sum of  and 
Constraints
1<= a,b <=1000
Sample Input
a = 2
b = 3
Sample Output
5
Explanation
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    static int solveMeFirst(int a, int b) {
      	if((a<=1000 && a>=1) && (b<=1000 && b>=1)){
              int c =a+b;
              return c;
          }else{
            //   System.out.println("Entered no is not correct");
              return 0;
          }
   }

 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
   }
}
