import java.util.Scanner;

class StringOp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ================= STRING OPERATIONS =================
        System.out.print("Enter a string (String class): ");
        String str = sc.nextLine();

        System.out.println("\n--- String Operations ---");
        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Character at index 2: " + str.charAt(2));
        System.out.println("Substring (0 to 4): " + str.substring(0, 4));
        System.out.println("Replace 'a' with 'x': " + str.replace('a', 'x'));
        System.out.println("Equals \"Java\": " + str.equals("Java"));
        System.out.println("Contains \"a\": " + str.contains("a"));

        // ================= STRINGBUFFER OPERATIONS =================
        System.out.print("\nEnter a string (StringBuffer class): ");
        StringBuffer sb = new StringBuffer(sc.nextLine());

        System.out.println("\n--- StringBuffer Operations ---");
        System.out.println("Original StringBuffer: " + sb);
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());

        sb.append(" Programming");
        System.out.println("After append(): " + sb);

        sb.insert(0, "Java ");
        System.out.println("After insert(): " + sb);

        sb.replace(0, 4, "Core");
        System.out.println("After replace(): " + sb);

        sb.delete(0, 5);
        System.out.println("After delete(): " + sb);

        sb.deleteCharAt(0);
        System.out.println("After deleteCharAt(): " + sb);

        System.out.println("Character at index 3: " + sb.charAt(3));

        sb.setCharAt(0, 'X');
        System.out.println("After setCharAt(): " + sb);

        sb.reverse();
        System.out.println("After reverse(): " + sb);

        System.out.println("Substring (0 to 5): " + sb.substring(0, 5));

        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(): " + sb.capacity());

        sc.close();
    }
}
