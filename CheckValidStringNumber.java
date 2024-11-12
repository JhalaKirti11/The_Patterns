import java.util.Scanner;

public class CheckValidStringNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String num = sc.nextLine();
        char ch ;
        int count = 0;
        
        for(int i = 0; i < num.length(); i++){
            ch = num.charAt(i);
            if(ch <= '9' && ch > '-' ){
               count++;
               
               }
        }
        if(num.length() == count){
            System.out.println(num+" is a valid number.");

        } else {
            System.out.println(num+ " is not a valid number!");
        }
        sc.close();
    }
}
