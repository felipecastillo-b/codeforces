import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            int w = scanner.nextInt();
            int total= 0;

            for (int i = 1; i <= w; i++) {
                total += k * i;
            }

            if (n > total) {
                System.out.println(0);
            } else {
                System.out.println(total - n);
            }
        }
    }
}