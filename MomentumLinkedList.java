/*

Problem Statement :

Ratul made a linked list, a list made of n nodes, where every node has two variables, 
the velocity and the mass of a particle.
Since all the particles have the velocity in the same direction, 
find the total momentum of the entity made by the particles from the linked list.

Constraints :
1<=n<=10000
1<=m,v<=100

Input format:
First line containing n, number of nodes
Then n lines containing the mass and the velocity space separated.
Output Format:
Single integer denoting the momentum

Sample Input:
4
1 3
2 4
2 3
4 5

Sample Output:
37

*/

import java.util.Scanner;

public class MomentumLinkedList {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;
    for(int i = 0; i < n; i++){
      int m = sc.nextInt();
      int v = sc.nextInt();
      ans += (m * v);
    }
    System.out.print(ans);
    

    sc.close();
  }
}
