import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    // Change this to the desired value of n
        long sum = sumOfSeries(n);
        System.out.println("The sum of the series is: " + sum);
    }

    public static long sumOfSeries(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (long) Math.pow(i, 3);
        }
        return sum;
    }
}

// enter the input = 5
// 225
// explaination = 1 + 8 + 27 + 64 + 125 = 225 
