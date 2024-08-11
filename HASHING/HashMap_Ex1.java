import java.util.HashMap;
import java.util.Map;

public class HashingExample {
    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        Map<String, Integer> hashMap = new HashMap<>();

        // Add some key-value pairs to the map
        hashMap.put("apple", 5);
        hashMap.put("banana", 7);
        hashMap.put("orange", 3);

        // Retrieve a value from the map using its key
        String key = "banana";
        Integer value = hashMap.get(key);
        System.out.println("Value for key '" + key + "': " + value);

        // Check if a key exists in the map
        key = "grape";
        if (hashMap.containsKey(key)) {
            System.out.println("Key '" + key + "' exists in the map");
        } else {
            System.out.println("Key '" + key + "' does not exist in the map");
        }
    }
}


// output will be 

Value for key 'banana': 7
Key 'grape' does not exist in the map


// explaination 
/*    
1> We create a HashMap called hashMap to store key-value pairs.
2> We add three key-value pairs to the map: "apple" => 5, "banana" => 7, and "orange" => 3.
3> We retrieve the value associated with the key "banana" using the get() method, which returns 7.
4> We check if the key "grape" exists in the map using the containsKey() method, which returns false because we didn't add a key-value pair for "grape" to the map.
*/
