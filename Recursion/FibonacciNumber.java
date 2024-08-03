class Solution {
    public int fib(int n) {
        if (n==0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        
       int firstTerm= 0;
       int secondTerm = 1;
    

        for(int i=1; i<=n; i++){
 
        int thirdTerm = firstTerm + secondTerm ;
  //swap
        firstTerm= secondTerm;
        secondTerm = thirdTerm;

        }
      return firstTerm;

   }

  // main method 

 public static void main (String [] args){
   int n = 5;
   fib(n);
 }  
}

// 0 1 1 2 3  
result will be 
