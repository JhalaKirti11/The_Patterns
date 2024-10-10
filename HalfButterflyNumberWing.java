/*           Half Diamond/Half Butterfly Wing...
  	   *
	     *1*
       *121*
       *12321*
       *1234321*
       *123454321*
       *12345654321*
       *123454321*
       *1234321*
       *12321*
       *121*
       *1*
       *                  */
        
import java.util.Scanner;

public class HalfButterflyNumberWing {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int n = sc.nextInt();

    System.out.println("*");
        int i = 1;
        while(i <= n) {
            int j = 1;
            int num = 1;
                System.out.print("*");
            while(j <= i ) {
                System.out.print(num);
                    num++;
                    j++;
            }
                j = 1;
                num = i - 1;
            while(j <= i - 1) {
                System.out.print(num);
                    num--;
                    j++;
            }
            System.out.println("*");
                i++;
        }

        i = n - 1;
        while(i >= 1) {
                int j = 1;
                int num = 1;
                System.out.print("*");

            while(j <= i ) {
                System.out.print(num);
                num++;
                j++;
            }
                j = 1;
                num = i - 1;
            while(j <= i - 1) {
                System.out.print(num);
                    num--;
                    j++;
            }
                System.out.println("*");
                    i--;
        }
        System.out.println("*");
        sc.close();
    }
}
