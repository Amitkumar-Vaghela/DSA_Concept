// using recursive method 

import java.util.*;

public class Main {
    public static void main(String[] args) {
    
    int n = 5;
    int result = factorial(n);
    System.out.println("The factorial of the number is: " + result);
  }
  
  static int factorial(int n){
    
    if (n == 0 || n == 1) {
      return 1; // base case
    } else {
      return n * factorial(n - 1); // recursive call
    }
  }
}

// output will be = 120


// using loop
