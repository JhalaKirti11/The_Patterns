/*    Enter no. of rows: 6
    6
    65
    654
    6543
    65432
    654321       */

import java.util.Scanner;
public class NumberPattern03 {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            int k = n;
            for(int j = 1; j <= i; j++){
                System.out.print(k);
                k--;
            }
            System.out.println();
        }
        sc.close();
    }
}
