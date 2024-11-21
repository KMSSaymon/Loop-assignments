// Write a program that reads a word and prints the number of vowels in the word. For
// this exercise, assume that a e i o u y are vowels. For example, if the user provides the
// input "Harry", the program prints 2 vowels.

public class VowelCounter {

    // returns count of vowels in a word.
    public int counter(String word)
    {
        int count = 0;

        for(int i=0; i<word.length(); i++)
        {
            if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')
            {
                if(word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I' || word.charAt(i) == 'O' || word.charAt(i) == 'U')
                {
                    count++;
                }
            }
            else if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z')
            {
                if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')
                {
                    count++;
                }
            }
        }

        return count;
    }
}