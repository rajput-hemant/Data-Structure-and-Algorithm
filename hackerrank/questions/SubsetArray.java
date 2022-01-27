package questions;

/*
Given two arrays: arr1[0..m-1] of size m and arr2[0..n-1] of size n. Task is to check whether arr2[] is a subset of arr1[] or not. Both the arrays can be both unsorted or sorted. It may be assumed that elements in both array are distinct.

Input Format

The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains an two integers m and n denoting the size of arr1 and arr2 respectively. The following two lines contains the space separated elements of arr1 and arr2 respectively.

Constraints

1 <= T <= 100 1 <= m,n <= 10^5 1 <= arr1[i], arr2[j] <= 10^5

Output Format

Print "Yes"(without quotes) if arr2 is subset of arr1. Print "No"(without quotes) if arr2 is not subset of arr1.

Sample Input 0

3
6 4
11 1 13 21 3 7
11 3 7 1
6 3
1 2 3 4 5 6
1 2 4
5 3
10 5 2 23 19
19 5 3
Sample Output 0

Yes
Yes
No
Explanation 0

(11, 3, 7, 1) is a subset of first array
*/

import java.util.Scanner;

public class SubsetArray {
      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      for (int i = 0; i < a; i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[] arr1 = new int[m];
            int[] arr2 = new int[n];
            for (int j = 0; j < m; j++) 
                  arr1[j] = sc.nextInt();
            for (int j = 0; j < n; j++) 
                  arr2[j] = sc.nextInt();
            System.out.println(chechSubString(arr1, arr2));
      }
      sc.close();
}
      static String chechSubString( int[] arr1, int[] arr2) {
            int flag = 0;
            for (int i : arr1)
                  for (int j : arr2)
                        if(i == j)
                              flag++;
            if(flag == arr2.length)
                  return "Yes";
            else
                  return "No";
      }
}
