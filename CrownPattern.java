/* Crown pattern

Enter the number of rows: 7

*            *            *
**          ***          **
***        *****        ***
****      *******      ****
*****    *********    *****
******  ***********  ******
***************************

*/
        
import java.util.Scanner;

public class CrownPattern {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int n = sc.nextInt();

    // 1st part...
    		int i = 1;
    		while(i <= n) {
    			int j = 1;
    			while(j <= i) {
    				System.out.print("*");
    				j++;
    			}
    			
    // spaces...
    			int spaces = 2 * (n - i);
    			j = 1;
    			while(j <= spaces) {
    				System.out.print(" ");
    				j++;
    		    }
    			
    // 2nd part (middle)...
    			j = 1;
    			while(j <= 2*i-1) {
    				System.out.print("*");
    				j++;
    			}

    // spaces...
    			spaces = 2 * (n - i);
    			j = 1;
    			while(j <= spaces) {
    				System.out.print(" ");
    				j++;
    		    }

    // 3rd part...
                j = 1;
    			while(j <= i) {
    				System.out.print("*");
    				j++;
    			}

    			System.out.println();
    			i++;
            }
        sc.close();
    }
}
