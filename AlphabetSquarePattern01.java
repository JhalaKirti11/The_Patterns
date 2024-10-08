import java.util.Scanner;

public class AlphabetSquarePattern01 {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        int i = 1;
        while(i <= n) {
            int j = 1;
            char character = (char)('A'+i-1);
            while(j <= n) {
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
