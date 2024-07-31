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
