import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String x = scanner.nextLine();
            int count = 0;
            // int length = x.length();
            // int half = (length + 1) / 2;

            for (int i = 0; i < x.length(); i++) {
                if (Character.isUpperCase(x.charAt(i))) {
                    count++;
                }
            }

            if (count > Math.ceil(x.length()/2)) {
                System.out.println(x.toUpperCase());
            } else {
                System.out.println(x.toLowerCase());
            }
        }
    }
}