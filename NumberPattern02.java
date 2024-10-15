/*    Enter the number of rows: 5
    1
   212
  32123
 4321234
543212345    */

import java.util.Scanner;
public class NumberPattern02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        for(int i= 1; i<=n; i++){
            for(int j = 1; j<= n-i; j++){
                System.out.print(" ");
            }
        // 1st half:
            for(int j = i; j>=1; j--){
                System.out.print(j);
            }
        // 2nd half :
            for(int j = 2; j<= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
