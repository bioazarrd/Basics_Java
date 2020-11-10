package A_JavaBasic;

import java.util.Scanner;

public class ReadingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());

        if (day == 1) {
            System.out.println("one");
        } else if (day == 2) {
            System.out.println("two");
        } else if (day == 3) {
            System.out.println("three");
        } else if (day == 4) {
            System.out.println("four");
        } else if (day == 5) {
            System.out.println("five");
        } else if (day == 6) {
            System.out.println("six");
        } else if (day == 7) {
            System.out.println("seven");
        } else if (day == 8) {
            System.out.println("eight");
        } else if (day == 9) {
            System.out.println("nine");
        } else {
            System.out.println("number too big");
        }
    }
}
