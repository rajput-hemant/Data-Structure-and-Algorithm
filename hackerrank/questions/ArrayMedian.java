package questions;

import java.util.Arrays;
import java.util.Scanner;

/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

Input Format
n1 & n2 (represents the size of arrays, arr1 and arr2)
User inputs in arr1 and arr2

Constraints
arr1.length == x
arr2.length == y
0 <= x <= 1000
0 <= y <= 1000
z <= x + y <= 2000

Output Format
Input: n1 = 2, n2 = 2, arr1 = [5,6], arr2 = [7,8]
Output: 6.5
Explanation: merged array = [5,6,7,8] and median is (6 + 7) / 2 = 6.5

Sample Input 0
4
3
12 21 34 56
11 34 67

Sample Output 0
34.0

Sample Input 1
2
1
1 3
2

Sample Output 1
2.0
*/

public class ArrayMedian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n = n1 + n2;
        int[] arr1 = new int[n1 + n2];
        for (int i = 0; i < n; i++)
            arr1[i] = sc.nextInt();
        Arrays.sort(arr1);
        float temp = (arr1[n / 2] + arr1[(n / 2) + 1]) / 2;
        System.out.println(temp);
        sc.close();
    }
}
