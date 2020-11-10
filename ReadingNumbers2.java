package A_JavaBasic;

import java.util.Scanner;

public class ReadingNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());

        String output;
        if (day == 1) {
            output = "One";
        } else if (day == 2) {
            output = "Two";
        } else if (day == 3) {
            output = "Three";
        } else if (day == 4) {
            output = "Four";
        } else if (day == 5) {
            output = "Five";
        } else if (day == 6) {
            output = "Six";
        } else if (day == 7) {
            output = "Seven";
        } else if (day == 8) {
            output = "Eight";
        } else if (day == 9) {
            output = "Nine";
        } else {
            output = "Number too big";
        }
            System.out.println(output);
        }
    }