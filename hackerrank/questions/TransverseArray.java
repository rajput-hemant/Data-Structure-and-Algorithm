package questions;

import java.util.Scanner;

/*
Program to find Smallest and Largest elements from One Dimensional Array Elements.

To find Smallest element from the Array - We will assume that first element is smallest and assign it in a variable and then compare each element from array with the variable, if any of the element is smaller than variable assign that element into variable, finally we will get smallest elements.

To find Largest element from the Array - We will assume that first element is largest and assign it in a variable and then compare each element from array with the variable, if any of the element is larger than variable assign that element into variable, finally we will get largest elements.

Input Format

Take an integer n as the size of array.
Take n elements of array from the user.
Constraints

n>0 && n<=10000
Output Format

First line should print the smallest element of the array.
Second line should print the largest element of the array.
Sample Input
5
2 65 98 75 21

Sample Output 
2
98
*/

public class TransverseArray {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int max = 0, min = Integer.MAX_VALUE;
            int n = sc.nextInt();
            int[] arr  = new int[n];
            for (int i = 0; i < n; i++)
                  arr[i] = sc.nextInt();
            sc.close();
            for (int i = 0; i < n; i++) {
                  if (arr[i] > max)
                        max = arr[i];
                  if (arr[i] < min)
                        min = arr[i];
            }
            System.out.println(min + "\n" + max);
      }
}