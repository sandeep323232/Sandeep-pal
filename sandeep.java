import java.util.ArrayList;

public class ArrayListIteration {
    public static void main(String[] args) {
        // Create an ArrayList and add elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        // Iterating using a simple for-loop
        System.out.println("Using for-loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Iterating using a while-loop
        System.out.println("\nUsing while-loop:");
        int index = 0;
        while (index < list.size()) {
            System.out.println(list.get(index));
            index++;
        }

        // Iterating using an advanced for-loop (for-each loop)
        System.out.println("\nUsing advanced for-loop:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}
