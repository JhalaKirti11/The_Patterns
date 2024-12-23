public class HelloWorldPattern {
    public static void main(String[] args) {
        String st = "HELLO_WORLD";
        int l = st.indexOf('_');
        int p = l+2;
        for(int i= 1; i<=l; i++){
            int k = i;
            for(int j = 1; j<= p; j++){
                System.out.print(st.charAt(k-1));
                k++;
            }
            System.out.println();
        }
    }
}
