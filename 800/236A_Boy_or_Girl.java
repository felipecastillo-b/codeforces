import java.util.Scanner;
import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String n = scanner.nextLine();
            HashSet<Character> set = new HashSet<>();

            for (int i = 0; i < n.length(); i++) {
                set.add(n.charAt(i));
            }

            StringBuilder response = new StringBuilder();
            for (Character c : set) {
                response.append(c);
            };

            if (response.length() % 2 == 0) {
                System.out.println("CHAT WITH HER!");
            } else {
                System.out.println("IGNORE HIM!");
            }
        }
    }
}