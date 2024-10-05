import java.util.Scanner;
public class NumberTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for(int i = 1; i<= n; i++) {
            int k = n-i+1;
            for(int j = 1; j<= 2*n-i; j++) {
                if(j<i) {
                    System.out.print(" ");	
                }else if(j<n){
                    System.out.print(k);
                    k++;
                }else {
                    System.out.print(k);
                    k--;
                }
            }
            System.out.println();
        }
            sc.close();
    }
}
