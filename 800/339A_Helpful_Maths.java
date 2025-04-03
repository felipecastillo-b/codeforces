import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String s = scanner.nextLine();
            String[] numbers = s.split("\\+"); 
            int[] nums = new int[numbers.length];

            for (int i = 0; i < numbers.length; i++) {
                nums[i] = Integer.parseInt(numbers[i]);
            }

            Arrays.sort(nums);

            StringBuilder r = new StringBuilder();
            for (int i = 0; i < nums.length; i++) {
                if (i > 0) {
                    r.append("+");
                }
                r.append(nums[i]);
            }
            System.out.println(r);
        }
    }
}