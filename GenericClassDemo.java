// Demonstration of Generic Class

class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class GenericClassDemo {
    public static void main(String[] args) {
        // Box of Integer
        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        System.out.println("Integer value: " + intBox.get());

        // Box of String
        Box<String> strBox = new Box<>();
        strBox.set("Hello Java");
        System.out.println("String value: " + strBox.get());
    }
}