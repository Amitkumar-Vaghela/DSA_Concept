// using parameterised 
class Recursion {
    
    static void func(int i, int n){
        
            // Base Condition.
            if(i<1) return;
            System.out.print(i);

            // Function call to print i till i decrements to 1.
            func(i-1,n);

    }
    public static void main(String[] args) {

       // Here, let’s take the value of n to be 4.
       int n = 4;
       func(n,n);
    }
}
// output will be   4 3 2 1

// using function

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        func(n);
    }

    public static void func(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.print(n + " ");
            func(n - 1);
        }
    }
}
