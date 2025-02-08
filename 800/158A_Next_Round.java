import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] data = new int[n + 1];
            int minScore = 0;

            for (int i = 1; i <= n; i++) {
                int score = scanner.nextInt();
                data[i] = score;

                if (i == k)
                    minScore = score;
            }

            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (data[i] >= minScore && data[i] > 0)
                    count++;
            }

            System.out.println(count);
        }
    }
}