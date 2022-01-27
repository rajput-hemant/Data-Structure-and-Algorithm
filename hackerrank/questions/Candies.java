package questions;

import java.util.Scanner;

/*
Alice is a kindergarten teacher. She wants to give some candies to the children in her class.  All the children sit in a line and each of them has a rating score according to his or her performance in the class.  Alice wants to give at least 1 candy to each child. If two children sit next to each other, then the one with the higher rating must get more candies. Alice wants to minimize the total number of candies she must buy.

Example


She gives the students candy in the following minimal amounts: . She must buy a minimum of 10 candies.

Function Description

Complete the candies function in the editor below.

candies has the following parameter(s):

int n: the number of children in the class
int arr[n]: the ratings of each student
Returns

int: the minimum number of candies Alice must buy
Input Format

The first line contains an integer, , the size of .
Each of the next  lines contains an integer  indicating the rating of the student at position .

Constraints

Sample Input 0

3
1
2
2
Sample Output 0

4
Explanation 0

Here 1, 2, 2 is the rating. Note that when two children have equal rating, they are allowed to have different number of candies. Hence optimal distribution will be 1, 2, 1.

Sample Input 1

10
2
4
2
6
1
7
8
9
2
1
Sample Output 1

19
Explanation 1

Optimal distribution will be 

Sample Input 2

8
2
4
3
5
2
6
4
5
Sample Output 2

12
Explanation 2

Optimal distribution will be .
*/

public class Candies {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            long sum = 0;
            int[] rate = new int[n];
            int[] score = new int[n];
            for (int i = 0; i < n; i++) {
                  rate[i] = sc.nextInt();
                  score[i] = 1;
            }
            sc.close();
            for (int i = 0; i < n-1; i++) {
                  if(rate[i] < rate[i+1])
                        score[i+1] = score[i] + 1;
            }
            for (int i = n-1; i > 0; i--) {
                  if(rate[i] < rate[i-1])
                        score[i-1] = Math.max(score[i-1], score[i] + 1);
            }
            for (int i = 0; i < n; i++)
                  sum += score[i];
            System.out.println(sum);
      }
}
