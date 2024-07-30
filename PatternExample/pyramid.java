// pyramid using * star

public class Pyramid {
    public static void printPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPyramid(5);
    }
}
    *
   ***
  *****
 *******
*********

// pyramid using Numbers 

public class NumberPyramid {
    public static void printNumberPyramid(int n) {
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printNumberPyramid(5);
    }
}


// output: 
    1
   2 3 4
  5 6 7 8 9
10 11 12 13 14 15
16 17 18 19 20 21 22



// pyramid using Alphaabet 

public class NumberPyramid {
    public static void printNumberPyramid(int n) {
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printNumberPyramid(5);
    }
}


// output :

     A
   B C D
  E F G H I
 J K L M N O
P Q R S T U V



