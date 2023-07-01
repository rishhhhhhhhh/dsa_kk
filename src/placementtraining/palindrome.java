import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        input = input.toLowerCase().replaceAll("\\s", "");

        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char c : input.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        boolean isPalindromePossible = true;
        int oddFrequencyCount = 0;
        for (int frequency : charFrequency.values()) {
            if (frequency % 2 != 0) {
                oddFrequencyCount++;
            }
            if (oddFrequencyCount > 1) {
                isPalindromePossible = false;
                break;
            }
        }

        if (isPalindromePossible) {
            StringBuilder palindromeBuilder = new StringBuilder();
            Character oddChar = null;

            for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
                char c = entry.getKey();
                int frequency = entry.getValue();

                if (frequency % 2 == 0) {
                    for (int i = 0; i < frequency / 2; i++) {
                        palindromeBuilder.append(c);
                    }
                } else {
                    oddChar = c;
                }
            }

            String palindrome = palindromeBuilder.toString();
            if (oddChar != null) {
                palindrome += oddChar;
            }
            palindrome += palindromeBuilder.reverse().toString();
            System.out.println("Possible palindrome: " + palindrome);
        } else {
            System.out.println("NO");
        }
    }
}
