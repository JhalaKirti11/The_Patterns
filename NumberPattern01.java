import java.util.Scanner;
public class NumberPattern01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the rows: ");
        int n = sc.nextInt();
        int i = 1;
        while(i<= n){
            int j = 1;
            int num = 2*i-1;
            while(j<=n-i+1){
                System.out.print(num);
                num+=2;
                j++;
            }
            j= n-1;
            num = 1;
            while(j>n-i){
                System.out.print(num);
                num+=2;
                j--;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}

/*
  enter the rows: 5
    13579
    35791
    57913
    79135
    91357        */
