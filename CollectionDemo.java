import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList<String> names = new ArrayList<>();

        // Adding elements
        names.add("Rahul");
        names.add("Amit");
        names.add("Sneha");
        names.add("Priya");

        // Displaying elements
        System.out.println("Names in ArrayList:");

        for (String name : names) {
            System.out.println(name);
        }

        // Removing an element
        names.remove("Amit");

        System.out.println("\nAfter removing Amit:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}