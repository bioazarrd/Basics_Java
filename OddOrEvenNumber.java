package A_JavaBasic;

import java.util.Scanner;

public class OddOrEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());

        if (first % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}