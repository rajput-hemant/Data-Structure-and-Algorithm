package questions;

import java.util.Scanner;

/*
Alina joined the company last week. She receives the company mails in bulk and it is very hectic to go through each and every mail. She wants to filter out the emails that are related to Human Resources(HR) Department. So help her make the list of the designations that are related to HR.

Write a program that accepts designations in a String array. Check the given array elements containing "HR" and display the total number of elements that contains "HR" and display the elements in the upper case. If no elements contains "HR" then return "-1" as output.

Input Format

A multiline string input.

Constraints

Atleast one element is required.

Output Format

Number of designation that contains "HR" along with the elements.

Sample Input 0
4
HRExecutive
Accountant
HRManager
SalesMan

Sample Output 0
2
HREXECUTIVE
HRMANAGER

Sample Input 1
2
Operator
Programmer

Sample Output 1
-1
*/

public class DesignationChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
            if(str[i].contains("HR"))
                count++;  
        }
        if(count > 0)
            System.out.println(count);
        else
            System.out.println("-1");
        for (int i = 0; i < n; i++) {
            if(str[i].contains("HR"))
                System.out.println(str[i].toUpperCase());
        }
        sc.close();
    }
}
