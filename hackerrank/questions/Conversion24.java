package questions;

import java.util.Scanner;
import java.util.Stack;

/*
Convert the input prefix expression into Infix expression.
Prefix : An expression is called the prefix expression if the operator appears in the expression before the operands. Simply of the form (operator operand1 operand2).
Example : *+AB-CD
Infix : An expression is called the Infix expression if the operator appears in between the operands in the expression. Simply of the form (operand1 operator operand2).
Example : (A+B) * (C-D)

Input Format
Input a string from the user.

Output Format
Print the infixed String.

Sample Input 0
*+AB-CD

Sample Output 0
((A+B)*(C-D))

Explanation 0
x+AB-CD is the input prefix and it's corresponding infix from is ((A+B)x(C-D)).
*/
public class Conversion24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(convertToInfix(str));
        sc.close();
    }

    private static boolean isOperator(char a) {
        switch (a) {
            case '+':
            case '-':
            case '*':
            case '/':
                return true;
        }
        return false;
    }

    private static String convertToInfix(String str) {
        Stack<String> stack = new Stack<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (isOperator(c)) {
                String temp1 = stack.pop();
                String temp2 = stack.pop();
                String newStr = "(" + temp1 + c + temp2 + ")";
                stack.push(newStr);
            } else
                stack.push(c + "");
        }
        return stack.peek();
    }
}
