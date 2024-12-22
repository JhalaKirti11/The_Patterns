/*      1AAAA
        12BBB
        123CC
        1234D
        12345        */

public class NumbAlphaPattern {
    public static void main(String[] args) {
        int n = 5;
        char c = 'A';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print(j);
                } else {
                    System.out.print(c);
                }
            }
            c++;
            System.out.println();
        }
    }
}
