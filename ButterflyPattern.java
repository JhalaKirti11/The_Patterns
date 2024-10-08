import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

// First Half
        for(int i = 1; i <= n; i++) {
            if(i==n) {
                for(int j = 1; j<=i;j++) {
                   System.out.print("*");
                }
            }else{
                for(int j = 1; j <= i; j++) {
                System.out.print("*");
                }
            }
            for(int j = 1; j <= 2 * (n-i); j++) {
                System.out.print(" ");
            }
    
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        System.out.println();
        }

// Second Half
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print("*");
            }
            for(int j = 1; j <= 2*(i); j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= n-i; j++) {
                System.out.print("*");
            }
        System.out.println();
        }
    sc.close();
    }
}
