

public class ReversePatternOfNumber {
    public static void main(String[] args) {
        int rows = 5; // You can change this value to print a reverse pattern of numbers with a different number of rows
        for(int i=rows; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
