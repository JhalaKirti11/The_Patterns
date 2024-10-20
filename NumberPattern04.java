/*  Enter no. of rows: 5
    1
    10
    101
    1010
    10101            */

import java.util.Scanner;
public class NumberPattern04 {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();
        for(int i = 0; i <= n; i++){
            for(int j = 1; j<= i; j++){
                if(j%2 == 0){
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
