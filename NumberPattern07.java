/*      Enter number of rows: 5
        555555555
         4444444
          33333
           222
            1              */

import java.util.Scanner;
public class NumberPattern07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int k = n;
        for(int i = 1; i<= n; i++) {
        	for(int j = 1; j<= i-1; j++) {
        		System.out.print(" ");
        	}
        	for(int j = 1; j<=k; j++) {
        		System.out.print(k);
        	}
        	for(int j = 1; j<= k-1; j++) {
        		System.out.print(k);
        	}
        	k--;
        	System.out.println();
        }
        sc.close();
    }
}
