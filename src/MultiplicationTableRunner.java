import java.util.Scanner;

public class MultiplicationTableRunner {
    public static void main(String[] args) {

        // creating objects 
        Scanner sc = new Scanner(System.in);
        MultiplicationTable multiplicationTable = new MultiplicationTable();

        // taking input from user.
        System.out.print("\nEnter ending number: ");
        int number = sc.nextInt();

        // printing result.
        for(int i=1; i<=number; i++)
        {
            multiplicationTable.tablePrinter(i);
        }

        sc.close();
    }
}