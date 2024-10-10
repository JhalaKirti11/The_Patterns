/*   Triangle Sum Pattern...
      
    1=1
    1+2=3
    1+2+3=6
    1+2+3+4=10
    1+2+3+4+5=15     
		    
*/
        
import java.util.Scanner;

public class TriangleSumPattern {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
  
            int n = sc.nextInt();
            int i = 1;
            int sum = 0;
            while(i <= n) {
                 int j = 1;
                while(j <= i) {
                    System.out.print(j);
                    if(j == i) {
                        sum = sum + i;
                        System.out.print("=" + sum);
                    }else {
                        System.out.print("+");
                    }
                    j++;
                    }
                System.out.println();
                i++;
            }
        sc.close();
    }
}
