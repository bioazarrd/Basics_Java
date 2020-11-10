package A_JavaBasic;

import java.util.Scanner;

public class ToysAreUs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceVacation = Double.parseDouble(scanner.nextLine());

        int puzzles = Integer.parseInt(scanner.nextLine());
        double price1 = 2.60;
        double total1 = price1 * puzzles;

        int barbi = Integer.parseInt(scanner.nextLine());
        double price2 = 3.00;
        double total2 = price2 * barbi;

        double teddyBear = Double.parseDouble(scanner.nextLine());
        double price3 = 4.10;
        double total3 = teddyBear * price3;

        double minions = Double.parseDouble(scanner.nextLine());
        double price4 = 8.20;
        double total4 = minions * price4;

        int trucks = Integer.parseInt(scanner.nextLine());
        double price5 = 2.00;
        double total5 = trucks * price5;

        double grantTotal = total5 + total4 + total3 + total2 + total1;
        double totalToys = puzzles + barbi + teddyBear + minions + trucks;


        if (totalToys >= 50) {
            grantTotal *= 0.75;
        }
            grantTotal *= 0.90;

            if (grantTotal >= priceVacation) {
                System.out.printf("Yes! %.2f lv left.", grantTotal - priceVacation);
            } else {
                System.out.printf("Not enough money! %.2f lv needed.", priceVacation - grantTotal);
            }
        }
    }