import java.util.Scanner;

public class BinaryExtractorRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BinaryExtractor binaryExtractor = new BinaryExtractor();

        System.out.print("\nEnter a number: ");
        int number = sc.nextInt();

        binaryExtractor.binaryGenerator(number);

        sc.close();
    }
}