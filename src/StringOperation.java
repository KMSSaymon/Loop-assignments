// this class provides below information about input string.

// 1. Prints only the uppercase letters.
// 2. Every second letter of the string.
// 3. The string , with all vowels replaced by an underscore.
// 4. The number of vowels in the string.
// 5. The positions of all vowels in the string.

public class StringOperation {

    // prints only the upper case letters of the input string.
    public void printUppercaseLetters(String st)
    {
        for(int i=0; i<st.length(); i++)
        {
            char ch = st.charAt(i);

            if(ch >= 'A' && ch <= 'Z')
            {
                System.out.printf("%c ",ch);
            }
        }
    }

    // prints every second letter of every word present in the string.
    public void printSecondLetter(String st)
    {
        String[] wordArray = st.split(" ",0);

        for(String word : wordArray)
        {
            if(word.length() >= 2)
            {
                System.out.printf("\t%s ---> %c\n",word,word.charAt(1));
            }
        }
    }

    // returns the string with all vowels replaced by an underscore.
    public String removeVowels(String st)
    {
        String answer = "";

        for(int i=0; i<st.length(); i++)
        {
            char ch = st.charAt(i);

            if(ch >= 'A' && ch <= 'Z')
            {
                if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                {
                    answer = answer + " ";
                }
                else
                {
                    answer = answer + ch;
                }
            }
            else if(ch >= 'a' && ch <= 'z')
            {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    answer = answer + " ";
                }
                else
                {
                    answer = answer + ch;
                }
            }
            else
            {
                answer = answer + ch;
            }
        }

        return answer;
    }

    // returns count of vowel in the string.
    public int countVowels(String st)
    {
        int count = 0;

        for(int i=0; i<st.length(); i++)
        {
            char ch = st.charAt(i);

            if(ch >= 'A' && ch <= 'Z')
            {
                if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                {
                    count = count +1;
                }
            }
            else if(ch >= 'a' && ch <= 'z')
            {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    count = count +1;
                }
            }
        }

        return count;
    }

    // prints positions of all vowels in the string.
    public void positionOfVowels(String st)
    {
        for(int i=0; i<st.length(); i++)
        {
            char ch = st.charAt(i);

            if(ch >= 'A' && ch <= 'Z')
            {
                if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                {
                    System.out.printf("%d ",i);
                }
            }
            else if(ch >= 'a' && ch <= 'z')
            {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    System.out.printf("%d ",i);
                }
            }
        }
    }

    // option displayer of the program.
    public void optionDisplay()
    {
        System.out.println("\t\tOption-1 : Prints only the uppercase letters of the string");
        System.out.println("\t\tOption-2 : Every second letter of every word in the string.");
        System.out.println("\t\tOption-3 : The string , with all vowels replaced by an underscore.");
        System.out.println("\t\tOption-4 : The number of vowels in the string.");
        System.out.println("\t\tOption-5 : The positions of all vowels in the string.");
        System.out.println("\t\tOption-6 : Exit the program.\n");

        System.out.print("Enter your option: ");

    }

}