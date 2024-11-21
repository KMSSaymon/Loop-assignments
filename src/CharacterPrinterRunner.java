import java.util.Scanner;

public class CharacterPrinterRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CharacterPrinter characterPrinter = new CharacterPrinter();

        String word = sc.next();

        characterPrinter.printCharacters(word);

        sc.close();
    }
}