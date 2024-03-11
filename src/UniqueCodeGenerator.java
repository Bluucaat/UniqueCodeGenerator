import java.util.HashSet;
import java.util.Random;

/**
 * The UniqueCodeGenerator class generates a set of unique codes based on user-defined parameters.
 * Each code is a combination of uppercase letters (A-Z) and numbers (0-9) with a specified length.
 * The generator ensures that the generated codes are unique within the result set.
 */
public class UniqueCodeGenerator {
    /**
     * Generates a set of unique codes.
     *
     * @param amount The number of codes to generate.
     * @param length The length of each code.
     * @return A HashSet containing the unique codes.
     */
    public HashSet<String> generateCode(int amount, int length) {
        final String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
        final String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };
        HashSet<String> codes = new HashSet<>();
        Random r = new Random();

        while (codes.size() < amount) {
            StringBuilder answer = new StringBuilder();
            for (int j = 0; j < length; j++) {
                int choice = r.nextInt(2);
                if (choice == 1) {
                    answer.append(letters[r.nextInt(0, letters.length)]);
                } else {
                    answer.append(numbers[r.nextInt(0, numbers.length)]);
                }
            }
            codes.add(answer.toString());
        }
        return codes;
    }
}


