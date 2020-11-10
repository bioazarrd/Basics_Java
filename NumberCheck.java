package A_JavaBasic;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int num1 = Integer.parseInt(scanner.nextLine());

        if (num1 < 100) {
            System.out.print("Less than 100");
        } else if (num1 > 200) {
            System.out.println("Greater than 200");
        } else {
            System.out.println("Between 100 and 200");
        }
    }
}