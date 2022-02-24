package questions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
Ram has a queue. He wants to reverse the first K element of his queue. Help him do the same using Stack data structure.

Input Format
size of queue
integer K denoting number of elements that need to be reversed
input the queue

Constraints
1

Output Format
reverse queue

Sample Input
7
3
12 3 4 67 88 22 54

Sample Output
4 3 12 67 88 22 54
*/

public class ReverseFirstNElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int size = sc.nextInt();
        int arr[] = new int[size];
        int k = sc.nextInt();
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (i >= k)
                q.add(arr[i]);
            if (i < k)
                q.add(arr[k - i - 1]);
        }
        for (int i = 0; i < size; i++) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
        sc.close();
    }
}