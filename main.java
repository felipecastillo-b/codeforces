import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            long n = scanner.nextLong(); // se puede recibir como string
            boolean isLucky = true; // no es necesario
            int count = 0;
            String nLength = String.valueOf(n);

            for (int i = 0; i < nLength.length(); i++) {
                int digit = Character.getNumericValue(nLength.charAt(i));
                if(digit == 4 || digit == 7) {
                    count++;
                }
            }

            if (count != 4 && count != 7) {
                isLucky = false;
            }

            System.out.println(isLucky ? "YES" : "NO");
        }
    }
}