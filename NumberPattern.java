/*
    1
   232
  34543
 4567654
567898765
 */

import java.util.Scanner;
public class NumberPattern {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int space = 1;
            while (space <= n - i) {
                System.out.print(" ");
                space++;
            }

            int j = 1;
            int num = i;
            while (j <= i) {
                System.out.print(num);
                num++;
                j++;
            }

            num = 2 * (i - 1);
            j = 1;
            while (j <= i - 1) {
                System.out.print(num);
                num--;
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
