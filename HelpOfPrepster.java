/*

Problem Statement :

Arnab has given me a challenge. I have to calculate the number of numbers which are less than a certain value n, 
and have exactly k set bits in its binary form. As you are a Prepster like me, 
help me write a code that will take input for n and k and give the expected output.

Constraints :

1<=n<=10000
1<=k<=10

Input Format :
First line containing n and k space separated

Output Format :
Number of numbers present in a single line

Sample Input:
7 2
Sample Output:
3
Explanation:
11,110,101 -> These three numbers.

*/


import java.util.Scanner;

public class HelpOfPrepster {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    int n = sc.nextInt(), k = sc.nextInt();
    for(int i = 1; i < n; i++){
      if(countSetBits(i) == k){
        count++;
      }
    }
    System.out.println(count);
    sc.close();
  }
  static int countSetBits(int i){
    if(i == 0){
      return 0;
    }
    return 1+countSetBits(i & (i - 1));
  }
}