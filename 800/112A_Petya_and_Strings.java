import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            //lowercase y luego compareTo
            String stringA = scanner.nextLine();
            String stringB = scanner.nextLine();


            if (stringA.toLowerCase().compareTo(stringB.toLowerCase()) == 0) {
                System.out.println(0);
            } else if (stringA.toLowerCase().compareTo(stringB.toLowerCase()) >= 1) {
                System.out.println(1);
            } else if (stringA.toLowerCase().compareTo(stringB.toLowerCase()) <= -1) {
                System.out.println(-1);
            }
        }
    }
}