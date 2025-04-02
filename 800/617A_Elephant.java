import java.util.Scanner;
// se puede optimizar -> count = (x + 4) / 5;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int x = scanner.nextInt();
            int aux = 0;
            int count = 0;

            do {
                aux += 5;
                count++;
            } while (aux < x );

            System.out.println(count);
        }
    }
}