import java.util.Scanner;

public class AllCharacterSquarePatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("\nChoose Pattern:");
        System.out.println("1. Same character in each row");
        System.out.println("2. Continuous characters (A–Z)");
        System.out.println("3. Row-wise (A B C … each row)");
        System.out.println("4. Column-wise (A A A …, B B B …)");
        System.out.println("5. Hollow square");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> sameCharacterEachRow(n);
            case 2 -> continuousCharacters(n);
            case 3 -> rowWise(n);
            case 4 -> columnWise(n);
            case 5 -> hollowSquare(n);
            default -> System.out.println("Invalid choice!");
        }

        sc.close();
    }

    // 1. Same character in each row
    static void sameCharacterEachRow(int n) {
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
            ch++;
        }
    }

    // 2. Continuous characters across the square
    static void continuousCharacters(int n) {
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ch + " ");
                ch++;
                if (ch > 'Z') ch = 'A'; // wrap after Z
            }
            System.out.println();
        }
    }

    // 3. Row-wise (A B C … per row)
    static void rowWise(int n) {
        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = 0; j < n; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    // 4. Column-wise (A A A …, B B B …)
    static void columnWise(int n) {
        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = 0; j < n; j++) {
                System.out.print((char)(ch + j) + " ");
            }
            System.out.println();
        }
    }

    // 5. Hollow square
    static void hollowSquare(int n) {
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print((char)('A' + j) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            ch++;
        }
    }
}





// 1️⃣ Same character in each row:
// A A A 
// B B B 
// C C C 

// 2️⃣ Continuous characters (A–Z):
// A B C 
// D E F 
// G H I 

// 3️⃣ Row-wise (A B C … each row):
// A B C 
// A B C 
// A B C 

// 4️⃣ Column-wise (A A A …, B B B …):
// A B C 
// A B C 
// A B C 

// 5️⃣ Hollow square:
// A B C 
// A   C 
// A B C 
