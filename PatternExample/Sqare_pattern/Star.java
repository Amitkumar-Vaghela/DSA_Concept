import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Square pattern
        for (int i = 0; i < n; i++) {          // rows
            for (int j = 0; j < n; j++) {      // columns
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
