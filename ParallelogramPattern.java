import java.util.Scanner;
public class ParallelogramPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        int i = 1;
        while(i<= r){
            int j = 1;
            while(j<= r-i){
                System.out.print("  ");
                j++;
            }
            j = 1;
            while(j<=r){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
