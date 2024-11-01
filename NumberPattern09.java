/*  Enter the number of rows: 5
        567898765
         4567654
          34543
           232
            1              */

import java.util.Scanner;
public class NumberPattern09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int k = n - i + 1;
            for (int j = 1; j <= 2 * n - i; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else if (j < n) {
                    System.out.print(k);
                    k++;
                } else {
                    System.out.print(k);
                    k--;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
