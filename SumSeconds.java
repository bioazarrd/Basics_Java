package A_JavaBasic;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int sum = first + second + third;
        int sum1 = sum - 120;
        int sum2 = sum - 60;

        if (sum < 10) {
            System.out.print(" 0:0" + sum);
        } else if (sum < 60) {
            System.out.println(" 0:" + sum);
        } else if (sum < 70) {
            System.out.print(" 1:0" + sum2);
        } else if ( sum < 120 ) {
            System.out.print(" 1:" + sum2);
        } else if (sum < 129 ) {
            System.out.print(" 2:0" + sum1);
        } else if (sum < 179) {
            System.out.print(" 2:" + sum1);
        }
    }
}