package questions;

/*
Create the function that accepts an integer array ‘arr’, its length and two integer variables ‘num’ and ‘diff’. Implement this function to find and return the number of elements of ‘arr’ having an absolute difference of less than or equal to ‘diff’ with ‘num’. Note: In case there is no element in ‘arr’ whose absolute difference with ‘num’ is less than or equal to ‘diff’, return -1.

Input Format
size of array input array two integers num and diff

Output Format
print count of elements of ‘arr’ having absolute difference of less than or equal to ‘diff’

Sample Input 0
6
12 3 14 56 77 13
13
2

Sample Output 0
3*/

import java.util.Scanner;

public class DifferenceAndNum {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int num = sc.nextInt();
        int diff = sc.nextInt();
        System.out.println(diffAndNum(n, arr, num, diff));
    }

    static int diffAndNum(int n, int[] arr, int num, int diff) {
        int flag = 0;
        for (int i = 0; i < n; i++)
            if (Math.abs(arr[i] - num) <= diff)
                flag++;
        return flag != 0 ? flag : -1;
    }
}
