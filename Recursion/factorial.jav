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

/*------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

// using loop method 

public class Main {
    public static void main(String[] args) {
    
    int n = 5;
    long result = factorial(n);
    System.out.println("The factorial of the number is: " + result);
  }
  
  static long factorial(int n){
    
    long ans = 1;
    for (int i = 1; i <= n;  i++){
      ans *= i;
    }
    return ans;
  }
}
/*------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

//using other approch like Biginteger class

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
    
    int n = 5;
    BigInteger result = factorial(n);
    System.out.println("The factorial of the number is: " + result);
  }
  
  static BigInteger factorial(int n){
    
    BigInteger ans = BigInteger.ONE;
    for (int i = 1; i <= n;  i++){
      ans = ans.multiply(BigInteger.valueOf(i));
    }
    return ans;
  }
}
