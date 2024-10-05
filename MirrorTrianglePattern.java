import java.util.Scanner;
public class MirrorTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        int k = n;
        for(int i = 1; i<= n; i++) {
            for(int j = 1; j<= i-1; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j<= k; j++)
            {
                System.out.print("* ");
                
            }
            k--;
               System.out.println();
        }
        sc.close();
    }
}
