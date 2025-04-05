import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String s = scanner.nextLine();

            if (!Character.isUpperCase(s.charAt(0))) {
                char x = Character.toUpperCase(s.charAt(0));
                s = x + s.substring(1);
            }

            System.out.println(s);
        }
    }
}