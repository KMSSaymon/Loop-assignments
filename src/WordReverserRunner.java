import java.util.Scanner;

public class WordReverserRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        WordReverser wordReverser = new WordReverser();

        System.out.print("Enter a string: ");
        String word = sc.next();

        System.out.println("Reversed String: " + wordReverser.wordReverse(word));

        sc.close();
    }
}