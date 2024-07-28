
import java.util.*;
class pattern{
public static void main (string [] args){

 int n = 5;
 for(int i =1; i<n; i++){
  for(int j =1; j<n; j++){
    system.out.print("*");
  }
  system.out.print();
   }
  }
}



// output shoud be 
  
   * * * * * 
   * * * * *
   * * * * *
   * * * * *
   * * * * *

// if the user want to user their input
    import java.util.Scanner;

class Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the pattern: ");
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

