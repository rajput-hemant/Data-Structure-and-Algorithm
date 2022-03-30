package questions;

import java.util.Scanner;

/*
 * You are given a function int CheckPassword(String str, int n);
 * 
 * The function accepts string str of size n as an argument. Implement the
 * function which returns 1 if given string str is valid password else 0. str is
 * a valid password if it satisfies the below conditions.
 * 
 * - At least 4 characters
 * - At least one numeric digit
 * - At Least one Capital Letter
 * - Must not have space or slash (/)
 * - Starting character must not be a number
 * 
 * Example:
 * 
 * Input:
 * aA1_67
 * 
 * Output:
 * 1
 * 
 * Sample Input:
 * a987 abC012
 * 
 * Output:
 * 0
 * 
 * Input Format
 * A string and n for string size.
 * 
 * Constraints
 * Input string will not be empty.
 * 
 * Output Format
 * Returns 1 if given string str is valid password else 0.
 * 
 * Sample Input 0
 * aA1_67
 * 
 * Sample Output 0
 * 1
 */

public class PasswordChecker10 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.next();
        int n = str.length();
        System.out.println(passwordChecker(str, n));
    }

    static int passwordChecker(String str, int n) {
        if (isValidPassword(str, n))
            return 1;
        else
            return 0;
    }

    static boolean isValidPassword(String str, int n) {
        boolean hasValidLen = false, hasOneNum = false, hasOneCap = false, hasNoSpaceOrSlash = false,
                hasNoNumInBeg = false;
        if (n > 4)
            hasValidLen = true;
        for (char i : str.toCharArray()) {
            if (48 <= (int) i && (int) i <= 57)
                hasOneNum = true;
            if (65 <= (int) i && (int) i <= 90)
                hasOneCap = true;
        }
        if (!(str.contains(" ") || str.contains("/")))
            hasNoSpaceOrSlash = true;
        if (!(48 <= (int) str.charAt(0) && (int) str.charAt(0) <= 57))
            hasNoNumInBeg = true;
        return hasValidLen && hasOneNum && hasOneCap && hasNoSpaceOrSlash && hasNoNumInBeg;
    }
}