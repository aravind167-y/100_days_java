

public class Triangle {
    public static void main(String[] args) {
        int rows = 5; // You can change this value to print a triangle with a different number of rows
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
