package A_JavaBasic;

import java.util.Scanner;

public class ToysAreUs2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cost = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddy = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double profit =
                puzzles * 2.60 + dolls * 3.00
                        + teddy * 4.10 + minions * 8.20
                        + trucks * 2.00;

        int toysCount = puzzles + dolls + teddy + minions + trucks;
        if (toysCount >= 50) {
            profit *= 0.75;
        }
        profit *= 0.90;

        if (profit >= cost) {
            System.out.printf("Yes! %.2f lv. left.", profit - cost);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", cost - profit);
        }
    }
}