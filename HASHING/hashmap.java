import.util.java.Hashmap;
public class myHashMapExample{
  public static void main (String[]args){
    // initialised Hashmap 
    HashMap <Integer , String> myMap = new HashMap<>();
    myMap.put(1 "Amit");
    myMap.put(2 , "Om");
    myMap.put(3 , "Ankit");
    myMap.put(4 , "Kartik");
    myMap.put(5 , "Vikash");
          System.out.println(myMap);                            // 1=Amit , 2=Om ,3=Ankit , 4=Kartik , 5=Vikas 
     System.out.println(myMap.put(5 , "Harsh"));                // 1=Amit , 2=Om ,3=Ankit , 4=Kartik , 5=Harsh its update the value .. its not accepts duplicates values                              
     System.out.println(myMap.get(6);                             // null
     System.out.println(myMap.containKey(1);                      // true
     System.out.println(myMap.containKey(6);                      // false
     System.out.println(myMap.getOrDefault(6 , "not present"));   // not present 
  }
}
