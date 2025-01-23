/*

Alex is a very good spy and he always wants to hide his contacts. To encrypt the original phone number,
he takes all the odd positioned numbers and places them in a starting positions and even position
numbers to the end position to encrypt phone numbers.

Help Alex to prepare transformed phone numbers by accepting N phone numbers.

Sample Input 1:
2
2143658790
1234567890

Output 1:
2468913570
1357924680

*/

import java.util.Scanner;

public class AlexNumberEncryption {

  private static String getEncrypt(String phoneNumber){
    StringBuilder oddPos = new StringBuilder();
    StringBuilder evenPos = new StringBuilder();

    // iterate over the phone number
    for(int i = 0; i < phoneNumber.length(); i++){
      // if its an odd position number
      if(i % 2 == 0){
        oddPos.append(phoneNumber.charAt(i));
      } else {
        // if its even position number
        // put them at the last
        evenPos.append(phoneNumber.charAt(i));
      }
    }
    return oddPos.toString() + evenPos.toString();

  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    sc.nextLine();
    for(int i = 0; i < n; i++){
      String phoneNumber = sc.nextLine();
      System.out.println(getEncrypt(phoneNumber));
    }
    sc.close();
  }
}
