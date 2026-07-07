

public class Pattern {
    public static void main(String[] args) {
        int rows = 5; // You can change this value to print a pattern with a different number of rows
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
