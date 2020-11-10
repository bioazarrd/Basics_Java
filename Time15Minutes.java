package A_JavaBasic;

import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        if (hour > 1) {
            hour *= 60;
        } else {
            hour = 0;
        }

        int minutes1 = minutes + 15;
        int hours1 = hour;
        int sum = hours1 + minutes1;

        if (sum % 60 == 0) {
            System.out.printf("%d:0%d", hours1, minutes1);
        } else {
            System.out.println();
        }
    }
}