import java.util.Scanner;

public class ManyTrianglePatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("\n1) Left-aligned Star Triangle:");
        leftStar(n);

        System.out.println("\n2) Right-aligned Star Triangle:");
        rightStar(n);

        System.out.println("\n3) Centered Pyramid (Stars):");
        centeredPyramid(n);

        System.out.println("\n4) Hollow Pyramid:");
        hollowPyramid(n);

        System.out.println("\n5) Inverted Star Triangle:");
        invertedStar(n);

        System.out.println("\n6) Mirrored Left Triangle (stars):");
        mirroredLeftStar(n);

        System.out.println("\n7) Floyd's Triangle (numbers):");
        floydTriangle(n);

        System.out.println("\n8) Number Triangle (row-wise 1..i):");
        numberTriangle(n);

        System.out.println("\n9) Inverted Number Triangle:");
        invertedNumberTriangle(n);

        System.out.println("\n10) 0-1 Triangle (alternating):");
        zeroOneTriangle(n);

        System.out.println("\n11) Character Triangle (A..):");
        characterTriangle(n);

        System.out.println("\n12) Mirrored Character Triangle:");
        mirroredCharacterTriangle(n);

        System.out.println("\n13) Pascal's Triangle:");
        pascalTriangle(n);

        sc.close();
    }

    // 1) Left-aligned stars
    static void leftStar(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
    }

    // 2) Right-aligned stars
    static void rightStar(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < n - i; s++) System.out.print("  ");
            for (int j = 0; j < i; j++) System.out.print("* ");
            System.out.println();
        }
    }

    // 3) Centered pyramid of stars
    static void centeredPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < n - i; s++) System.out.print("  ");
            for (int k = 0; k < 2 * i - 1; k++) System.out.print("* ");
            System.out.println();
        }
    }

    // 4) Hollow pyramid
    static void hollowPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < n - i; s++) System.out.print("  ");
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == 1 || i == n || j == 1 || j == 2 * i - 1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    // 5) Inverted star triangle
    static void invertedStar(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
    }

    // 6) Mirrored left triangle (stars shifted right)
    static void mirroredLeftStar(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < n - i; s++) System.out.print("  ");
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
    }

    // 7) Floyd's triangle
    static void floydTriangle(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    // 8) Number triangle 1..i each row
    static void numberTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }
    }

    // 9) Inverted number triangle
    static void invertedNumberTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }
    }

    // 10) 0-1 alternating triangle
    static void zeroOneTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int val = (i + j) % 2; // alternate 0 and 1
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // 11) Character triangle (A B C ...)
    static void characterTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
                if (ch > 'Z') ch = 'A';
            }
            System.out.println();
        }
    }

    // 12) Mirrored character triangle (columns are same char)
    static void mirroredCharacterTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < n - i; s++) System.out.print("  ");
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
                if (ch > 'Z') ch = 'A';
            }
            System.out.println();
        }
    }

    // 13) Pascal's triangle (simple integer version)
    static void pascalTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i - 1; s++) System.out.print("  ");
            int val = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(val + "   ");
                val = val * (i - j) / (j + 1); // compute next binomial coefficient
            }
            System.out.println();
        }
    }
}
