// Mejorar, creo que se puede plantear de otra manera este ejercicio
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
        int number = 1;
        int arrayX = 2;
        int arrayZ = 2;
        int arrayI = -1;
        int arrayJ = -1;
        int result = 0;
        int[][] array = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == number) {
                    arrayI = i;
                    arrayJ = j;
                    break;
                }
            }
            if (arrayI != -1) {
                break;
            }
        }

        result = (Math.abs(arrayI - arrayX) + Math.abs(arrayJ - arrayZ));
        System.out.println(result);
        }
    }
}
