import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner numbScanner = new Scanner(System.in)) {
            int number = numbScanner.nextInt();

            if (number == 2) {
                System.out.println("NO");
            } else if (number%2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}