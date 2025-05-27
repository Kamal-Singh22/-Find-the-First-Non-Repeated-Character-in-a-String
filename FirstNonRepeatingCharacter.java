import java.util.*;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "swiss";
        char result = findFirstNonRepeating(input);

        if (result == 0) {
            System.out.println("No non-repeating characters found.");
        } else {
            System.out.println("First non-repeating character: " + result);
        }
    }

    public static char findFirstNonRepeating(String str) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return 0; // Null character as a signal for "not found"
    }
}
