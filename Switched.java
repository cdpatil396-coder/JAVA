public class Switched {
    public static void main(String[] args) {

        char color = 'r';

        switch (color) {
            case 'r':
                System.out.println("red");
                break;

            case 'g':
                System.out.println("green");
                break;

            case 'b':
                System.out.println("blue");
                break;

            default:
                System.out.println("No color selected");
        }
    }
}
