// GetExample.java
import java.util.ArrayList;

public class GetExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        String element = list.get(1);                // get element at index 1
        System.out.println(element);                // Banana
    }
}
