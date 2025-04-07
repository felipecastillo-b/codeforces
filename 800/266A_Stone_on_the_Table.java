import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            scanner.nextLine(); // consumir salto de linea del int scanner
            String s = scanner.nextLine();
            int count = 0;

            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i-1)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}