import java.util.ArrayList;

public class AddIndexExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add(1, "Cherry");      // add Cherry at index 1
        System.out.println(list);   // [Apple, Cherry, Banana]
    }
}
