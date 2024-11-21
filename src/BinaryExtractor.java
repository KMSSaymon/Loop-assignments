// This class takes a number and prints all of its binary digits: 
// For example, if the user provides the input 13, the output should be
// 1
// 0
// 1
// 1


public class BinaryExtractor {

    // generates binary form of the given number.
    public void binaryGenerator(int number)
    {
        while(number != 0)
        {
            System.out.println(number%2);
            number = number/2;
        }

    }
}