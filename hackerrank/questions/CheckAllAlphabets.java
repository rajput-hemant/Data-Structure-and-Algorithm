package questions;

import java.util.Scanner;

/*
Emily has been given an assignment to check if all the letters of the English Alphabet are present in the given sentence or not. Help her recognize it by writing a code. You can ignore cases i.e no case-sensitivity required.

Example: "We promptly judged antique ivory buckles for the next prize"

The string contains all letters in the English alphabet.

Input Format

A single line with string s.

Constraints

0 < length of s < 1000

Output Format

Print "Yes" in case it contains all letters of English alphabet otherwise "No"

Sample Input 0

Pack my box with five dozen liquor jugs
Sample Output 0

Yes
Sample Input 1

Sympathizing would fix objectives.
Sample Output 1

No
*/

public class CheckAllAlphabets {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            sc.close();
            int flag = 1;
            // to convert original string uppercase char to lowercase char
            String str1 = str.toLowerCase();
            for(char i = 'a'; i <= 'z';i++) {
                  String s = Character.toString(i);
                  if(str1.contains(s) == false) {
                        flag = 0;
                        break;
                  }
            }
            if(flag == 0)
                  System.out.println("No");
            else
                  System.out.println("Yes");
      }
}
