package questions;

import java.util.Scanner;
import java.util.Stack;

/*
Write a program to delete the middle element of an array using stack.By using the fundamental functions of stack - push(), pop(), peek(), etc.

Input Format
An integer n denoting the size of the input integer array.
n elements of integer array

Output Format
Print the remaining elements of array in reverse order after deleting the middle element.

Sample Input 0
5
1 3 4 7 6

Sample Output 0
6 7 3 1

Sample Input 1
8
3 5 1 9 5 6 2 4


Sample Output 1
4 2 6 5 1 5 3
*/
public class MiddleElement2 {
    static int top = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            top++;
            stack.push(arr[i]);
        }
        System.out.println(top);
        removeMiddleElement(stack, top, n);
        while (!stack.isEmpty()) {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }
        sc.close();
    }

    public static void removeMiddleElement(Stack<Integer> stack, int top, int n) {
        if (top == n - n / 2) {
            stack.pop();
            return;
        }
        top--;
        int temp = stack.pop();
        removeMiddleElement(stack, top, n);
        stack.push(temp);
    }
}
