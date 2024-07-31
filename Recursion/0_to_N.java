class Solution {

static void  func(int i , int N){

  if (i>N) return ;           // check the condition if satisfy then 
  System.out.println(i);     //  print the number 
  func(i+1 , N);             // increment by 1
}
  
  public static void main(String[] args){
    int N = 5;          // print the output till 5
    func(1 , N);      // calling the the method 
  }
}
