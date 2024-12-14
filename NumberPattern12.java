import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int k = i / 2;
            for (int j = 1; j <= n; j++) {
                if (i % 2 != 0) {
                    System.out.print(i * j + " ");
                } else {
                    System.out.print(k * j + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
