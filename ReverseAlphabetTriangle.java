/*        E
          DE
          CDE
          BCDE
          ABCDE        */

import java.util.Scanner;
public class ReverseAlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
       
		      int n = sc.nextInt();
		      int i = 1;
		      while(i <= n) {
			        int j = 1;
			        char character = (char)('A' + n - i);
			            while(j <= i) {
				              System.out.print(character);
				              character++;
				                j++;
			            }
			        System.out.println();
			            i++;
		    }
              sc.close();
    }
}
