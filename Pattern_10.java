
//      0
//    0 1 0
//   0 2 3 4 0
//  0 5 6 7 8 9 0
// 0 10 11 12 13 14 15 16 0

import java.util.Scanner;

public class Pattern_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				if (j == 1 || j == 2 * i - 1) {
					System.out.print("0 ");
				} else {
					System.out.print(k + " ");
					k++;
				}
			}

			System.out.println();
		}
	}
}
