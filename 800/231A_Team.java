import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> listText = new ArrayList<>();
            int count = 0;
            int n = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < n; i++) {
                listText.add(scanner.nextLine());
            }
            
            for (int i = 0; i < listText.size(); i++) {
                String text = listText.get(i);
                int aux = 0;

                for (int j = 0; j < text.length(); j++) {
                    if (text.charAt(j) == '1') {
                        aux++;
                    }
                }

                if (aux > 1) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}