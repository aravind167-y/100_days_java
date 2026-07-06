

public class SumOfOddNumbers_1_N {
    public static void main(String[] args) {
        int N = 100; // You can change this value to sum odd numbers up to a different N
        int sum = 0;

        for(int i=1; i<=N; i++){
            if(i%2!=0){
                sum += i;
            }
        }

        System.out.println("Sum of odd numbers from 1 to " + N + " is: " + sum);
    }
}
