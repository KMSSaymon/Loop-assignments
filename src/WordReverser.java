// Write a program that reads a word and prints the word in reverse. For example, if the
// user provides the input "Harry", the program prints yrraH


public class WordReverser {

    // returns reversed string
    public String wordReverse(String word)
    {
        String ans = "";

        for(int i=word.length()-1; i>=0; i--)
        {
            ans = ans + word.charAt(i);
        }

        return ans;
    }
}