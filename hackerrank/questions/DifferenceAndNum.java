package questions;

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
