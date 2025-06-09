import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            int aux;

            for (int i = 0; i < n; i++) {
                aux = k % 10;
                if (aux == 0) {
                    k /= 10;
                } else {
                    k -= 1;
                }
            }
            System.out.println(k);
        }
    }
}