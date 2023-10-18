import java.util.*;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a pangram:");
        String input = scanner.nextLine();
        scanner.close();

        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        if (input == null || input.length() < 26) {
            return false;
        }

        input = input.toLowerCase();
        Set<Character> set = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                set.add(c);
            }
        }
        return set.size() == 26;
    }
}
