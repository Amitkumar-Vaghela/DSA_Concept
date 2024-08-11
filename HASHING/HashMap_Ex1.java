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
