import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            scanner.nextLine(); // salto de linea
            String s = scanner.nextLine();
            int a = 0, d = 0;

            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);

                if (c == 'A') {
                    a++;
                } else {
                    d++;
                }
            }

            if (a > d) {
                System.out.println("Anton");
            } else if(a < d) {
                System.out.println("Danik");
            } else {
                System.out.println("Friendship");
            }
        }
    }
}