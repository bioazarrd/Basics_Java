package A_JavaBasic;

import java.util.Scanner;

public class Problem1MoreExcersices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int V = Integer.parseInt(scanner.nextLine()); // ot 1 - 10,000
        int p1 = Integer.parseInt(scanner.nextLine()); // 1- 5,000
        int p2 = Integer.parseInt(scanner.nextLine()); // 1- 5,000
        double H = Double.parseDouble(scanner.nextLine()); // 1.00 - 24.00

        double p1Liters = p1 * H;
        double p2Liters = p2 * H;

        double sum = p1Liters + p2Liters;

        double full = (sum / V) * 100;

        double p1Percentage = (p1Liters / sum) * 100;
        double p2Percentage = 1- p1Percentage;

        if (sum <= V) {
            System.out.printf("The pool is %.02f full. Pipe 1: %.02f. Pipe 2: %.02f", full, p1Percentage, p2Percentage);
        } else if ( sum > V) {
            double extra = sum - V;
            System.out.printf(" For %f hours the pool overflows with %f liters.", H, extra );
        }
    }
}