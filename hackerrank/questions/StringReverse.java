package questions;

import java.util.Scanner;

/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string A , print Yes if it is a palindrome, print No otherwise.

Constraints

A will consist at most 50 lower case english letters.
Sample Input
madam

Sample Output
Yes
*/

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String str = sc.next();
        for (int i = 0; i < str.length()/2 + 1; i++) {
            if(str.charAt(i) == str.charAt(str.length()-i-1))
                count++;
        }
        if (count == str.length()/2 + 1)
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();
    }
}
