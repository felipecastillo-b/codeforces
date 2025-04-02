import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int count = 0;

            while (a <= b) {
                a *= 3;
                b *= 2;
                count++;
            }
            System.out.println(count);
        }
    }
}