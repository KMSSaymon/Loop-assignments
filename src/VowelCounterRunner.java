import java.util.Scanner;

public class VowelCounterRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VowelCounter vowelCounter = new VowelCounter();

        System.out.print("Enter word: ");
        String word = sc.next();

        int count = vowelCounter.counter(word);

        System.out.println("Number of vowels: " + count);

        sc.close();
    }
}
