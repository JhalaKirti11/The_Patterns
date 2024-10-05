import java.util.Scanner;
public class AlphabetTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        char alpha = 'A';
        for(int i = 1; i<= n; i++) {
            for(int j = 1; j<= n-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j<= i; j++)
            {
                System.out.print(alpha+" ");
                alpha = (char)(alpha+1);
            }
            
               System.out.println();
        }
        sc.close();
    }
}
