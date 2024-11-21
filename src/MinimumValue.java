// Set a Boolean variable “first” to true.
// If the scanner has more numbers
// Read the next value.
// If first is true
// Set the minimum to the value.
// Set first to false.
// Else if the value is less than the minimum
// Set the minimum to the value.
// Print the minimum

import java.util.Scanner;

public class MinimumValue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Boolean first = true;
        int minimum=-1;

        while(sc.hasNextInt())
        {

            int num = sc.nextInt();

            if(first == true)
            {
                minimum = num;
                first = false;
            }
            else
            {
                minimum = Math.min(minimum,num);
            }

        }

        sc.close();

        System.out.println("Minimum number: " + minimum);
    }
}