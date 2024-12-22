/*    11111
      12221
      12321
      12221
      11111      */

import java.util.Scanner;
public class NumberPattern02 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = n / 2 + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i <= k && j <= i) || (i >= k && j <= n - i + 1)) {
                    System.out.print(j);
                } else if (i <= k && j <= n - i + 1) {
                    System.out.print(i);
                } else if (i >= k && j <= 2 * i - n + 1) {
                    System.out.print(n - i + 1);
                } else {
                    System.out.print(n - j + 1);
                }
            }
            System.out.println();
        }
          sc.close();
    }
}
