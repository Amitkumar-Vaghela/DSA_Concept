public class FullDiamondPattern {
    public static void main(String[] args) {
        int n = 5;
        // Print the upper half of the diamond
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            for (int l = i - 1; l >= 0; l--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Print the lower half of the diamond
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            for (int l = i - 1; l >= 0; l--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 
