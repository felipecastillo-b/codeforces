import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {

                List<String> listText = new ArrayList<>();
                int number = scanner.nextInt();
                scanner.nextLine();

                for (int i = 0; i < number; i++) {
                    listText.add(scanner.nextLine());
                }

                for (int i = 0; i < listText.size(); i++) {
                    String aux = listText.get(i);
                    String text;

                    if (aux.length() > 10) {
                        text = aux.charAt(0) + String.valueOf(aux.length() - 2) + aux.charAt(aux.length() - 1);
                    } else {
                        text = aux;
                    }
                    System.out.println(text);
                }
        }
    }
}