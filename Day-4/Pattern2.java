

public class Pattern2 {
    public static void main(String[] args) {
        int rows = 5; // You can change this value to print a pattern with a different number of rows
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
