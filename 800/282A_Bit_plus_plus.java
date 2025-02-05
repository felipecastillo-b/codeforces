import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> listText = new ArrayList<>();
            int x = 0;
            int n = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < n; i++) {
                listText.add(scanner.nextLine());
            }

            for (int i = 0; i < listText.size(); i++) {
                String statement = listText.get(i);

                if (statement.equals("X++") || statement.equals("++X")) {
                    x++;
                } else if (statement.equals("X--") || statement.equals("--X")) {
                    x--;
                }
            }

            System.out.println(x);
        }
    }
}