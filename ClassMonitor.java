/*

Problem Statement :

After JEE Mains, some students got admission into an engineering college. Now there is a class consisting of such n students, 
and the HOD came to say it is time to select the class monitor. But He never gets all of them at one time. So he brought a register, 
every time he gets someone with less rank than the previous time he cut the name and wrote the name of the student and the rank.
For a given number of ranks he gets each time, you have to predict how many names are cut in the list.

Constraints:
Number of Visiting<=10^9
ranks <=10000

Input Format:
Number of Visiting N in their first line
N space separated ranks the HOD gets each time

Output Format:
Number of ranks cut in the list

Sample Input:
6
4 3 7 2 6 1

Sample Output:
3

*/


import java.util.Scanner;

class ClassMonitor{
  public static void main(String[] args) {
    int max = Integer.MAX_VALUE;
    int count=0;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      if(arr[i] < max){
        max = arr[i];
        count++;
      }
    }
    System.out.println(count - 1);
    sc.close();
  }
}