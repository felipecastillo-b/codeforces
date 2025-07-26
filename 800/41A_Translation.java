import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String s = scanner.nextLine();
            String t = scanner.nextLine();
            boolean aux = true;

            if (s.length() != t.length()) { // s.equals(t)
                aux = false;
            } else {
                for (int i = 0; i < s.length(); i++) { // stringbuilder.reverse.tostring
                    if (s.charAt(i) != t.charAt(t.length() - 1 - i)) {
                        aux = false;
                        break;
                    }
                }
            }
            System.out.println(aux ? "YES" : "NO");
        }
    }
}