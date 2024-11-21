import java.util.Scanner;
import java.util.Random;

public class StringPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Read a word
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Repeat word.length() times
        for (int k = 0; k < word.length(); k++) {
            // Pick a random position i in the word, but not the last position
            int i = random.nextInt(word.length() - 1); // Random index from 0 to word.length() - 2

            // Pick a random position j > i in the word
            int j = random.nextInt(word.length() - i - 1) + i + 1; // Random index from i + 1 to word.length() - 1

            // Swap the letters at positions j and i
            String first = word.substring(0, i);
            String middle = word.substring(i + 1, j);
            String last = word.substring(j + 1);
            word = first + word.charAt(j) + middle + word.charAt(i) + last;
        }

        // Print the permuted word
        System.out.println("Permuted word: " + word);
    }
}
