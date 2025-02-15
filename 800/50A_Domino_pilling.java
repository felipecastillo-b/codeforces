import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int area = m*n;
            int result = area/2;

            System.out.println(result);
        }
    }
}
