import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SubstringSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a word
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // List to store all substrings
        ArrayList<String> substrings = new ArrayList<>();

        // Generate all substrings
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                substrings.add(word.substring(i, j));
            }
        }

        // Sort substrings by length
        substrings.sort(Comparator.comparingInt(String::length));

        // Print the substrings
        System.out.println("Substrings sorted by length:");
        for (String substring : substrings) {
            System.out.println(substring);
        }
    }
}
