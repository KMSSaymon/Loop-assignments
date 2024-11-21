// Write a program that reads a word and prints each character of the word on a separate line.

public class CharacterPrinter {

    // prints characters of a word.
    public void printCharacters(String word)
    {
        for(int i=0; i<word.length(); i++)
        {
            System.out.println(word.charAt(i));
        }
    }
}