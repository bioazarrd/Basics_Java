package A_JavaBasic;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine(); // Martin
        String lastName = scanner.nextLine(); // Martin

        if (firstName.equals(lastName)) {

            System.out.println("Names are equal!");
        }
    }
}
