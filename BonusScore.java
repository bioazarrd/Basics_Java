package A_JavaBasic;
import java.util.Scanner;
public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        double bonus;

        if (input <= 100) {
            bonus = 5;
        } else if (input < 1000) {
            bonus = input * 0.20;
        } else {
            bonus = input * 0.10;
        }

        if (input % 2 == 0) {
            bonus += 1;
        } else if (input % 5 == 0) {
            bonus += 2;
        }
        System.out.println(bonus);
        System.out.println(input + bonus);
    }
}