import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int h = scanner.nextInt();
            int totalWidth = 0;

            for (int i = 0; i < n; i++) {
                int height = scanner.nextInt();
                totalWidth += (height > h) ? 2 : 1;
            }

            System.out.println(totalWidth);
        }
    }
}