import java.util.Scanner;

public class TrianglePatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("\n1️⃣ Star Triangle:");
        starTriangle(n);

        System.out.println("\n2️⃣ Number Triangle:");
        numberTriangle(n);

        System.out.println("\n3️⃣ Character Triangle:");
        characterTriangle(n);

        System.out.println("\n4️⃣ Inverted Star Triangle:");
        invertedStarTriangle(n);

        System.out.println("\n5️⃣ Inverted Number Triangle:");
        invertedNumberTriangle(n);

        System.out.println("\n6️⃣ Inverted Character Triangle:");
        invertedCharacterTriangle(n);

        sc.close();
    }

    // 1. Star Triangle
    static void starTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 2. Number Triangle
    static void numberTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // 3. Character Triangle
    static void characterTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    // 4. Inverted Star Triangle
    static void invertedStarTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 5. Inverted Number Triangle
    static void invertedNumberTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // 6. Inverted Character Triangle
    static void invertedCharacterTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}






// 1️⃣ Star Triangle:
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 

// 2️⃣ Number Triangle:
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5 

// 3️⃣ Character Triangle:
// A 
// A B 
// A B C 
// A B C D 
// A B C D E 

// 4️⃣ Inverted Star Triangle:
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 

// 5️⃣ Inverted Number Triangle:
// 1 2 3 4 5 
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1 

// 6️⃣ Inverted Character Triangle:
// A B C D E 
// A B C D 
// A B C 
// A B 
// A 

